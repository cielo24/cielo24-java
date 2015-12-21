import org.junit.After;
import org.junit.Before;

import cielo24.Actions;
import cielo24.Enums.ErrorType;
import cielo24.utils.Guid;
import cielo24.utils.WebException;

import java.io.IOException;

public class ActionsTest {

    protected Config config = new Config();
    protected Actions actions = new Actions(this.config.serverUrl);
    protected Guid apiToken = null;
    protected Guid secureKey = null;

    @Before
    public void setUp() throws IOException, WebException {
        this.apiToken = actions.login(this.config.username, this.config.password, true);
        this.secureKey = actions.generateAPIKey(this.apiToken, this.config.username, true);
    }

    @After
    public void tearDown() throws IOException, WebException {
        if (this.apiToken != null && this.secureKey != null) {
            try {
                this.actions.removeAPIKey(this.apiToken, this.secureKey);
            } catch (WebException e) {
                if (e.getErrorType().equals(ErrorType.ACCOUNT_UNPRIVILEGED.toString())) {
                    this.apiToken = this.actions.login(this.config.username, this.config.password);
                    this.actions.removeAPIKey(this.apiToken, this.secureKey);
                }
                // Else - pass silently
            }
        }
    }
}