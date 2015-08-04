package cielo24.options;

import java.util.ArrayList;

import cielo24.utils.QueryName;
import static cielo24.Enums.*;

public class CaptionOptions extends CommonOptions {

    @QueryName("build_url")
    public Boolean buildUrl = null;
    @QueryName("caption_words_min")
    public Integer captionWordsMin = null;
    @QueryName("caption_by_sentence")
    public Boolean captionBySentence = null;
    @QueryName("characters_per_caption_line")
    public Integer charactersPerCaptionLine = null;
    @QueryName("dfxp_header")
    public String dfxpHeader = null;
    @QueryName("disallow_dangling")
    public Boolean disallowDangling = null;
    @QueryName("display_effects_speaker_as")
    public String effectsSpeaker = null;
    @QueryName("display_speaker_id")
    public SpeakerId displayedSpeakerId = null;
    @QueryName("force_case")
    public Case forceCase = null;
    @QueryName("include_dfxp_metadata")
    public Boolean includeDfxpMetadata = null;
    @QueryName("layout_target_caption_length_ms")
    public Integer layoutTargetCaptionLengthMs = null;
    @QueryName("line_break_on_sentence")
    public Boolean lineBreakOnSentence = null;
    @QueryName("line_ending_format")
    public LineEnding lineEndingFormat = null;
    @QueryName("lines_per_caption")
    public Integer linesPerCaption = null;
    @QueryName("maximum_caption_duration")
    public Integer maximumCaptionDuration = null;
    @QueryName("merge_gap_interval")
    public Integer mergeGapInterval = null;
    @QueryName("minimum_caption_length_ms")
    public Integer minimumCaptionLengthMs = null;
    @QueryName("minimum_gap_between_captions_ms")
    public Integer minimumGapBetweenCaptionsMs = null;
    @QueryName("minimum_merge_gap_interval")
    public Integer minimumMergeGapInterval = null;
    @QueryName("qt_seamless")
    public Boolean qtSeamless = null;
    @QueryName("silence_max_ms")
    public Integer silenceMaxMs = null;
    @QueryName("single_speaker_per_caption")
    public Boolean singleSpeakerPerCaption = null;
    @QueryName("sound_threshold")
    public Integer soundThreshold = null;
    @QueryName("sound_tokens_by_caption")
    public Boolean soundTokensByCaption = null;
    @QueryName("sound_tokens_by_line")
    public Boolean soundTokensByLine = null;
    @QueryName("sound_tokens_by_caption_list")
    public ArrayList<Tag> soundTokensByCaptionList = null;
    @QueryName("sound_tokens_by_line_list")
    public ArrayList<Tag> soundTokensByLineList = null;
    @QueryName("speaker_on_new_line")
    public Boolean speakerOnNewLine = null;
    @QueryName("srt_format")
    public String srtFormat = null;
    @QueryName("srt_print")
    public Boolean srtPrintCaptionNumbers = null;
    @QueryName("strip_square_brackets")
    public Boolean stripSquareBrackets = null;
    @QueryName("utf8_mark")
    public Boolean utf8Mark = null;
}