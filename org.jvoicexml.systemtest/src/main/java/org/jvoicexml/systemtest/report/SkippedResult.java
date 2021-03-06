/*
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2006-2012 JVoiceXML group - http://jvoicexml.sourceforge.net
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Library General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Library General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Library General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.jvoicexml.systemtest.report;

import org.jvoicexml.systemtest.Result;
import org.jvoicexml.systemtest.TestResult;

/**
 * the result of test case be skipped.
 * @author lancer
 * @author Dirk Schnelle-Walka
 *
 */
public class SkippedResult implements Result {

    /**
     * reason of skip.
     */
    private final String reason;

    /**
     * @param arg0 reason of skip.
     */
    public SkippedResult(final String arg0) {
        reason = arg0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestResult getAssert() {
        return TestResult.SKIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getReason() {
        return reason;
    }
}
