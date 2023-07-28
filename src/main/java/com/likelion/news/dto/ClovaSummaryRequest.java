package com.likelion.news.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClovaSummaryRequest {


    private ClovaRequestDocument document;
    private ClovaRequestOption option;


    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Data
    public static class ClovaRequestOption{
        private String language;
        private String model;
        private Integer tone;
        private Integer summaryCount;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Data
    public static class ClovaRequestDocument{
        private String title;
        private String content;
    }



    @AllArgsConstructor
    @Getter
    public static enum ClovaRequestOptionLanguage{
        KOREAN("ko"), JAPANESE("ja");
        private final String value;
    }

    /**
    * @className ClovaRequestOptionModel
    * @author : Minseok Kim
    * @description Option에 대한 enum. 일반 문서는 GENERAL, 뉴스는 NEWS 사용
     */
    @AllArgsConstructor
    @Getter
    public static enum ClovaRequestOptionModel{
        GENERAL("general"), NEWS("news");
        private final String value;
    }

    /**
     * @className ClovaRequestOptionTone
     * @author : Minseok Kim
     * @description Option에 대한 enum. 요약본의 어투를 변환
     */
    @AllArgsConstructor
    @Getter
    public static enum ClovaRequestOptionTone{
        원문_어투_유지(0), 해요체(1), 정중체(2), 명사형_종결체(3);
        private final Integer value;
    }
}
