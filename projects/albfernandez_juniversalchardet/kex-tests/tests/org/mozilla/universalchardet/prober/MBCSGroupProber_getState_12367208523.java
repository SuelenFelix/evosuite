package org.mozilla.universalchardet.prober;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.mozilla.universalchardet.prober.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class MBCSGroupProber_getState_12367208523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307529;

    public MBCSGroupProber_getState_12367208523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term307645 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term307644 = ((Class) term307645).getDeclaredField((String) "DETECTING");
        ((Field) term307644).setAccessible(true);
        Object enum39 = ((Field) term307644).get((Object) null);
        Object term307545 = newInstance(Class.forName("org.mozilla.universalchardet.prober.GB18030Prober"));
        Object term307546 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307550 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.GB2312DistributionAnalysis"));
        byte[] term307554 = (byte[]) newByteArray(2);
        setField(term307546, term307546.getClass(), "model", null);
        setIntField(term307546, term307546.getClass(), "currentState", 0);
        setIntField(term307546, term307546.getClass(), "currentCharLen", 0);
        setIntField(term307546, term307546.getClass(), "currentBytePos", 0);
        setField(term307545, term307545.getClass(), "codingSM", term307546);
        setField(term307545, term307545.getClass(), "state", enum39);
        setIntField(term307550, term307550.getClass(), "freqChars", 0);
        setIntField(term307550, term307550.getClass(), "totalChars", 0);
        setField(term307550, term307550.getClass(), "charToFreqOrder", null);
        setFloatField(term307550, term307550.getClass(), "typicalDistributionRatio", 0.9F);
        setField(term307545, term307545.getClass(), "distributionAnalyzer", term307550);
        setField(term307545, term307545.getClass(), "lastChar", term307554);
        setBooleanField(term307545, term307545.getClass(), "active", true);
        Object term307558 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term307559 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        setField(term307559, term307559.getClass(), "model", null);
        setIntField(term307559, term307559.getClass(), "currentState", 0);
        setIntField(term307559, term307559.getClass(), "currentCharLen", 0);
        setIntField(term307559, term307559.getClass(), "currentBytePos", 0);
        setField(term307558, term307558.getClass(), "codingSM", term307559);
        setField(term307558, term307558.getClass(), "state", enum39);
        setIntField(term307558, term307558.getClass(), "numOfMBChar", 0);
        setBooleanField(term307558, term307558.getClass(), "active", true);
        Object term307565 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Big5Prober"));
        Object term307566 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307570 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.Big5DistributionAnalysis"));
        byte[] term307574 = (byte[]) newByteArray(2);
        setField(term307566, term307566.getClass(), "model", null);
        setIntField(term307566, term307566.getClass(), "currentState", 0);
        setIntField(term307566, term307566.getClass(), "currentCharLen", 0);
        setIntField(term307566, term307566.getClass(), "currentBytePos", 0);
        setField(term307565, term307565.getClass(), "codingSM", term307566);
        setField(term307565, term307565.getClass(), "state", enum39);
        setIntField(term307570, term307570.getClass(), "freqChars", 0);
        setIntField(term307570, term307570.getClass(), "totalChars", 0);
        setField(term307570, term307570.getClass(), "charToFreqOrder", null);
        setFloatField(term307570, term307570.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term307565, term307565.getClass(), "distributionAnalyzer", term307570);
        setField(term307565, term307565.getClass(), "lastChar", term307574);
        setBooleanField(term307565, term307565.getClass(), "active", true);
        Object term307578 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SJISProber"));
        Object term307579 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307583 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis"));
        Object term307588 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.SJISDistributionAnalysis"));
        byte[] term307592 = (byte[]) newByteArray(2);
        setField(term307579, term307579.getClass(), "model", null);
        setIntField(term307579, term307579.getClass(), "currentState", 0);
        setIntField(term307579, term307579.getClass(), "currentCharLen", 0);
        setIntField(term307579, term307579.getClass(), "currentBytePos", 0);
        setField(term307578, term307578.getClass(), "codingSM", term307579);
        setField(term307578, term307578.getClass(), "state", enum39);
        setField(term307583, term307583.getClass(), "relSample", null);
        setIntField(term307583, term307583.getClass(), "totalRel", 0);
        setIntField(term307583, term307583.getClass(), "lastCharOrder", -1);
        setIntField(term307583, term307583.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term307583, term307583.getClass(), "done", false);
        setField(term307583, term307583.getClass(), "tmpOrder", null);
        setField(term307578, term307578.getClass(), "contextAnalyzer", term307583);
        setIntField(term307588, term307588.getClass(), "freqChars", 0);
        setIntField(term307588, term307588.getClass(), "totalChars", 0);
        setField(term307588, term307588.getClass(), "charToFreqOrder", null);
        setFloatField(term307588, term307588.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term307578, term307578.getClass(), "distributionAnalyzer", term307588);
        setField(term307578, term307578.getClass(), "lastChar", term307592);
        setBooleanField(term307578, term307578.getClass(), "active", true);
        Object term307596 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCJPProber"));
        Object term307597 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307601 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis"));
        Object term307606 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis"));
        byte[] term307610 = (byte[]) newByteArray(2);
        setField(term307597, term307597.getClass(), "model", null);
        setIntField(term307597, term307597.getClass(), "currentState", 0);
        setIntField(term307597, term307597.getClass(), "currentCharLen", 0);
        setIntField(term307597, term307597.getClass(), "currentBytePos", 0);
        setField(term307596, term307596.getClass(), "codingSM", term307597);
        setField(term307596, term307596.getClass(), "state", enum39);
        setField(term307601, term307601.getClass(), "relSample", null);
        setIntField(term307601, term307601.getClass(), "totalRel", 0);
        setIntField(term307601, term307601.getClass(), "lastCharOrder", -1);
        setIntField(term307601, term307601.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term307601, term307601.getClass(), "done", false);
        setField(term307601, term307601.getClass(), "tmpOrder", null);
        setField(term307596, term307596.getClass(), "contextAnalyzer", term307601);
        setIntField(term307606, term307606.getClass(), "freqChars", 0);
        setIntField(term307606, term307606.getClass(), "totalChars", 0);
        setField(term307606, term307606.getClass(), "charToFreqOrder", null);
        setFloatField(term307606, term307606.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term307596, term307596.getClass(), "distributionAnalyzer", term307606);
        setField(term307596, term307596.getClass(), "lastChar", term307610);
        setBooleanField(term307596, term307596.getClass(), "active", true);
        Object term307614 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCKRProber"));
        Object term307615 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307619 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCKRDistributionAnalysis"));
        byte[] term307623 = (byte[]) newByteArray(2);
        setField(term307615, term307615.getClass(), "model", null);
        setIntField(term307615, term307615.getClass(), "currentState", 0);
        setIntField(term307615, term307615.getClass(), "currentCharLen", 0);
        setIntField(term307615, term307615.getClass(), "currentBytePos", 0);
        setField(term307614, term307614.getClass(), "codingSM", term307615);
        setField(term307614, term307614.getClass(), "state", enum39);
        setIntField(term307619, term307619.getClass(), "freqChars", 0);
        setIntField(term307619, term307619.getClass(), "totalChars", 0);
        setField(term307619, term307619.getClass(), "charToFreqOrder", null);
        setFloatField(term307619, term307619.getClass(), "typicalDistributionRatio", 6.0F);
        setField(term307614, term307614.getClass(), "distributionAnalyzer", term307619);
        setField(term307614, term307614.getClass(), "lastChar", term307623);
        setBooleanField(term307614, term307614.getClass(), "active", true);
        Object term307627 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCTWProber"));
        Object term307628 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307632 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCTWDistributionAnalysis"));
        byte[] term307636 = (byte[]) newByteArray(2);
        setField(term307628, term307628.getClass(), "model", null);
        setIntField(term307628, term307628.getClass(), "currentState", 0);
        setIntField(term307628, term307628.getClass(), "currentCharLen", 0);
        setIntField(term307628, term307628.getClass(), "currentBytePos", 0);
        setField(term307627, term307627.getClass(), "codingSM", term307628);
        setField(term307627, term307627.getClass(), "state", enum39);
        setIntField(term307632, term307632.getClass(), "freqChars", 0);
        setIntField(term307632, term307632.getClass(), "totalChars", 0);
        setField(term307632, term307632.getClass(), "charToFreqOrder", null);
        setFloatField(term307632, term307632.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term307627, term307627.getClass(), "distributionAnalyzer", term307632);
        setField(term307627, term307627.getClass(), "lastChar", term307636);
        setBooleanField(term307627, term307627.getClass(), "active", true);
        ArrayList term307543 = new ArrayList();
        ((ArrayList) term307543).add(term307545);
        ((ArrayList) term307543).add(term307558);
        ((ArrayList) term307543).add(term307565);
        ((ArrayList) term307543).add(term307578);
        ((ArrayList) term307543).add(term307596);
        ((ArrayList) term307543).add(term307614);
        ((ArrayList) term307543).add(term307627);
        term307529 = newInstance(Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber"));
        setField(term307529, term307529.getClass(), "state", enum39);
        setField(term307529, term307529.getClass(), "probers", term307543);
        setField(term307529, term307529.getClass(), "bestGuess", null);
        setIntField(term307529, term307529.getClass(), "activeNum", 7);
        setBooleanField(term307529, term307529.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term307529, args);
    }

};


