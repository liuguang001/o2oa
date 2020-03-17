package com.x.attendance.assemble.control.jaxrs;

import com.x.base.core.project.jaxrs.CipherManagerJaxrsFilter;

import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns = "/jaxrs/dingding/*", asyncSupported = true)
public class DingdingJaxrsFilter extends CipherManagerJaxrsFilter {
}
