package cielo24.options;

import java.util.ArrayList;

import cielo24.utils.QueryName;

import javax.time.calendar.LocalDateTime;

import static cielo24.Enums.*;

public abstract class CommonOptions extends BaseOptions {

    @QueryName("elementlist_version")
    public LocalDateTime elementListVersion = null;
    @QueryName("emit_speaker_change_token_as")
    public String speakerChangeToken = null;
    @QueryName("mask_profanity")
    public Boolean maskProfanity = null;
    @QueryName("remove_disfluencies")
    public Boolean removeDisfluencies = null;
    @QueryName("remove_sounds_list")
    public ArrayList<Tag> removeSoundsList = null;
    @QueryName("remove_sound_references")
    public Boolean removeSoundReferences = null;
    @QueryName("replace_slang")
    public Boolean replaceSlang = null;
    @QueryName("sound_boundaries")
    public char[] soundBoundaries = null;
}