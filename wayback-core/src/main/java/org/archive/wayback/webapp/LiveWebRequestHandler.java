package org.archive.wayback.webapp;

import javax.servlet.http.HttpServletRequest;

import org.archive.wayback.core.WaybackRequest;
import org.archive.wayback.util.webapp.AbstractRequestHandler;

public abstract class LiveWebRequestHandler extends AbstractRequestHandler {

	// If this resource has been successfully handled by the liveweb
	public abstract boolean isLiveWebFound(HttpServletRequest request, WaybackRequest wbRequest);
}
