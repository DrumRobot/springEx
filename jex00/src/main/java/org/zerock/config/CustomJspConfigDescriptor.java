package org.zerock.config;

import java.util.*;

import javax.servlet.descriptor.*;

public class CustomJspConfigDescriptor implements JspConfigDescriptor {
 
    private Collection<JspPropertyGroupDescriptor> jspPropertyGroups = new LinkedHashSet<JspPropertyGroupDescriptor>();
 
    private Collection<TaglibDescriptor> taglibs = new HashSet<TaglibDescriptor>();
 
    @Override
    public Collection<JspPropertyGroupDescriptor> getJspPropertyGroups() {
//        JspPropertyGroup newJspPropertyGroup = new JspPropertyGroup();
//        newJspPropertyGroup.addUrlPattern("*.jsp");
//        newJspPropertyGroup.setPageEncoding("UTF-8");
//        newJspPropertyGroup.setScriptingInvalid("false");
//        newJspPropertyGroup.addIncludePrelude("/WEB-INF/jsp/common/common.jsp");
//        JspPropertyGroupDescriptor jspDescriptor = new JspPropertyGroupDescriptorImpl(newJspPropertyGroup);
//        jspPropertyGroups.add(jspDescriptor);
//        return jspPropertyGroups;
    	return null;
    }
 
    @Override
    public Collection<TaglibDescriptor> getTaglibs() {
        return taglibs;
    }
 
}