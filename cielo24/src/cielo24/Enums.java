package cielo24;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class Enums {

    public enum ErrorType {
        LOGIN_INVALID,
        ACCOUNT_EXISTS,
        ACCOUNT_DOES_NOT_EXIST,
        ACCOUNT_UNPRIVILEGED,
        BAD_API_TOKEN,
        INVALID_QUERY,
        INVALID_OPTION,
        INVALID_URL,
        MISSING_PARAMETER,
        NOT_IMPLEMENTED,
        ITEM_NOT_FOUND,
        INVALID_RETURN_HANDLERS,
        NOT_PARENT_ACCOUNT,
        NO_CHILDREN_FOUND,
        UNHANDLED_ERROR
    }

    public enum JobStatus {
        @SerializedName("Authorizing")
        AUTHORIZING,
        @SerializedName("Pending")
        PENDING,
        @SerializedName("In Process")
        IN_PROCESS,
        @SerializedName("Complete")
        COMPLETE,
        @SerializedName("Media Failure")
        MEDIA_FAILURE,
        @SerializedName("Reviewing")
        REVIEWING;

        @Override
        public String toString() {
            return Utils.getSerializedName(this);
        }
    }

    public enum Priority {
        ECONOMY,
        STANDARD,
        PRIORITY,
        CRITICAL
    }

    public enum Fidelity {
        MECHANICAL,
        PREMIUM,
        PROFESSIONAL
    }

    public enum CaptionFormat {
        SRT,
        SBV,
        SCC,
        DFXP,
        QT,
        TRANSCRIPT,
        TWX,
        TPM,
        WEB_VTT,
        ECHO
    }

    public enum TokenType {
        @SerializedName("word")
        WORD,
        @SerializedName("punctuation")
        PUNCTUATION,
        @SerializedName("sound")
        SOUND;

        @Override
        public String toString() {
            return Utils.getSerializedName(this);
        }
    }

    public enum Tag {
        UNKNOWN,
        INAUDIBLE,
        CROSSTALK,
        MUSIC,
        NOISE,
        LAUGH,
        COUGH,
        FOREIGN,
        BLANK_AUDIO,
        APPLAUSE,
        BLEEP,
        ENDS_SENTENCE
    }

    public enum SpeakerId {
        @SerializedName("no")
        NO,
        @SerializedName("number")
        NUMBER,
        @SerializedName("name")
        NAME;

        @Override
        public String toString() {
            return Utils.getSerializedName(this);
        }
    }

    public enum SpeakerGender {
        UNKNOWN,
        MALE,
        FEMALE
    }

    public enum Case {
        @SerializedName("upper")
        UPPER,
        @SerializedName("lower")
        LOWER,
        @SerializedName("")
        UNCHANGED;

        @Override
        public String toString() {
            return Utils.getSerializedName(this);
        }
    }

    public enum LineEnding {
        UNIX,
        WINDOWS,
        OSX
    }

    public enum CustomerApprovalStep {
        TRANSLATION,
        RETURN
    }

    public enum CustomerApprovalTool {
        AMARA,
        CIELO24
    }

    public enum Language {
        @SerializedName("en")
        ENGLISH,
        @SerializedName("fr")
        FRENCH,
        @SerializedName("es")
        SPANISH,
        @SerializedName("de")
        GERMAN,
        @SerializedName("cmn")
        MANDARIN_CHINESE,
        @SerializedName("pt")
        PORTUGUESE,
        @SerializedName("jp")
        JAPANESE,
        @SerializedName("ar")
        ARABIC,
        @SerializedName("ko")
        KOREAN,
        @SerializedName("zh")
        TRADITIONAL_CHINESE,
        @SerializedName("hi")
        HINDI,
        @SerializedName("it")
        ITALIAN,
        @SerializedName("ru")
        RUSSIAN,
        @SerializedName("tr")
        TURKISH,
        @SerializedName("he")
        HEBREW;

        @Override
        public String toString() {
            return Utils.getSerializedName(this);
        }
    }
    
    public enum IWP {
        PREMIUM,
        INTERIM_PROFESSIONAL,
        PROFESSIONAL,
        SPEAKER_ID,
        FINAL,
        MECHANICAL,
        CUSTOMER_APPROVED_RETURN,
        CUSTOMER_APPROVED_TRANSLATION
    }

    public enum JobDifficulty {
        @SerializedName("Good")
        GOOD,
        @SerializedName("Bad")
        BAD,
        @SerializedName("Unknown")
        UNKNOWN;

        @Override
        public String toString() {
            return Utils.getSerializedName(this);
        }
    }

    // For mapping purposes
    protected static class FidelityDeserializer implements JsonDeserializer<Fidelity> {
        @Override
        public Fidelity deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
            if (json.getAsString().equals("STANDARD")) {
                return Fidelity.PREMIUM;
            } else if (json.getAsString().equals("HIGH")) {
                return Fidelity.PROFESSIONAL;
            } else {
                return new GsonBuilder().create().fromJson(json, type);
            }
        }
    }
}