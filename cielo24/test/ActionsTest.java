import org.junit.Before;

import cielo24.Actions;
import cielo24.utils.Guid;

public class ActionsTest {

    protected Config config = new Config();
    protected Actions actions = new Actions(this.config.serverUrl);
    protected Guid apiToken = null;
    protected Guid secureKey = null;

    @Before
    public void setUp() throws Exception {
        this.apiToken = actions.login(this.config.username, this.config.password, true);
        this.secureKey = actions.generateAPIKey(this.apiToken, this.config.username, true);
    }
}