/**
* Copyright (c) Acroquest Technology Co, Ltd. All Rights Reserved.
* Please read the associated COPYRIGHTS file for more details.
*
* THE SOFTWARE IS PROVIDED BY Acroquest Technolog Co., Ltd.,
* WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
* BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
* IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDER BE LIABLE FOR ANY
* CLAIM, DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
* OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
*/
package acromusashi.stream.bolt;

import java.util.Map;

import acromusashi.stream.entity.StreamMessage;
import backtype.storm.task.TopologyContext;

/**
 * KeyTraceBaseBolt検証用のモッククラス
 *
 * @author kimura
 */
public class BlankAmBaseBolt extends AmBaseBolt
{

    /** serialVersionUID */
    private static final long serialVersionUID = -1271953207061271186L;

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("rawtypes")
    @Override
    public void onPrepare(Map stormConf, TopologyContext context)
    {
        // Do nothing.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onExecute(StreamMessage message)
    {
        // Do nothing.
    }
}
