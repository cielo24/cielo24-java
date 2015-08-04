package cielo24.options;

import cielo24.utils.QueryName;

public class TranscriptOptions extends CommonOptions {

    @QueryName("create_paragraphs")
    public Boolean createParagraphs = null;
    @QueryName("newlines_after_paragraph")
    public Integer newLinesAfterParagraph = null;
    @QueryName("newlines_after_sentence")
    public Integer newLinesAfterSentence = null;
    @QueryName("timecode_every_paragraph")
    public Boolean timeCodeEveryParagraph = null;
    @QueryName("timecode_format")
    public String timeCodeFormat = null;
    @QueryName("timecode_interval")
    public Integer timeCodeInterval = null;
    @QueryName("timecode_offset")
    public Integer timeCodeOffset = null;
}