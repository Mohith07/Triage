package com.hackathon.triage.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.hackathon.triage.util.JsonUtil;

import java.util.Map;

/**
 * @author <a href="mailto:arpit.srivastava@navis.com">Arpit Srivastava</a>
 */
public class ProjectParser {

    public Object parseJson(String inJson) {
        Map<String, Object> jsonObject = JsonUtil.fromJson(inJson, new TypeReference<Map<String, Object>>() {
        });
        return null;
    }
}
