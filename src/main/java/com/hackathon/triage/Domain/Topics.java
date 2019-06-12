package com.hackathon.triage.Domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.hackathon.triage.util.StringConstants.ADAPTER;
import static com.hackathon.triage.util.StringConstants.DISPACHER;
import static com.hackathon.triage.util.StringConstants.SCHEDULER;

public class Topics {
    static Map<ComponentEnum, List<String>> mapOfCategoryAndListOftopics = null;

    public Map<ComponentEnum, List<String>> initialise() {
        mapOfCategoryAndListOftopics = new HashMap<>();
        for (ComponentEnum componentEnum : ComponentEnum.values()) {
            List<String> topics = getCorrespondingTopics(componentEnum);
            mapOfCategoryAndListOftopics.put(componentEnum, topics);
        }
        return mapOfCategoryAndListOftopics;
    }

    public List<String> getCorrespondingTopics(ComponentEnum inComponent) {
        switch (inComponent) {
            case A4:
                return getA4TopicList();
            case N4_general:
                return getN4GeneralList();
            case AGV:
                return getAgvList();
            case ASC:
                return getAscList();
            case ECI:
                return getEciList();
            case EDI:
                return getEdiList();
            case XPS:
                return getXpsList();
            case ECN4:
                return getEcn4List();
            case Vessel:
               return getVesselList();
            case Rail:
                return getRailList();
            case N4_mobile:
                return getN4MobileList();
            case N4_framework:
                return getN4FrameWorkList();
            case N4_clustering:
                return getN4ClusteringList();
            case Expert_decking:
                return getExpertDeckingList();
        }
        return Collections.emptyList();
    }

    private List<String> getExpertDeckingList() {
        return Arrays.asList();
    }

    private List<String> getN4ClusteringList() {
        return Arrays.asList();
    }

    private List<String> getN4FrameWorkList() {
        return Arrays.asList();
    }

    private List<String> getN4MobileList() {
        return Arrays.asList();
    }

    private List<String> getRailList() {
        return Arrays.asList();
    }

    private List<String> getVesselList() {
        return Arrays.asList();
    }

    private List<String> getEcn4List() {
        return Arrays.asList();
    }

    private List<String> getXpsList() {
        return Arrays.asList();
    }

    private List<String> getEdiList() {
        return Arrays.asList();
    }

    private List<String> getEciList() {
        return Arrays.asList();
    }

    private List<String> getAscList() {
        return Arrays.asList();
    }

    private List<String> getAgvList() {
        List<String> topicAgvList = Arrays.asList();
        return topicAgvList;
    }

    private List<String> getN4GeneralList() {
        List<String> topicsN4GeneralList= Arrays.asList();
        return topicsN4GeneralList;
    }


    private List<String> getA4TopicList() {
        List<String> topicsA4 = Arrays.asList(SCHEDULER, DISPACHER, ADAPTER);
        return topicsA4;
    }


}
