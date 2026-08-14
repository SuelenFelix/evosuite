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

public class MBCSGroupProber_getCharSetName_13305994531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306587;

    public MBCSGroupProber_getCharSetName_13305994531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term306703 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term306702 = ((Class) term306703).getDeclaredField((String) "DETECTING");
        ((Field) term306702).setAccessible(true);
        Object enum37 = ((Field) term306702).get((Object) null);
        Object term306603 = newInstance(Class.forName("org.mozilla.universalchardet.prober.GB18030Prober"));
        Object term306604 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term306608 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.GB2312DistributionAnalysis"));
        byte[] term306612 = (byte[]) newByteArray(2);
        setField(term306604, term306604.getClass(), "model", null);
        setIntField(term306604, term306604.getClass(), "currentState", 0);
        setIntField(term306604, term306604.getClass(), "currentCharLen", 0);
        setIntField(term306604, term306604.getClass(), "currentBytePos", 0);
        setField(term306603, term306603.getClass(), "codingSM", term306604);
        setField(term306603, term306603.getClass(), "state", enum37);
        setIntField(term306608, term306608.getClass(), "freqChars", 0);
        setIntField(term306608, term306608.getClass(), "totalChars", 0);
        setField(term306608, term306608.getClass(), "charToFreqOrder", null);
        setFloatField(term306608, term306608.getClass(), "typicalDistributionRatio", 0.9F);
        setField(term306603, term306603.getClass(), "distributionAnalyzer", term306608);
        setField(term306603, term306603.getClass(), "lastChar", term306612);
        setBooleanField(term306603, term306603.getClass(), "active", true);
        Object term306616 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term306617 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        setField(term306617, term306617.getClass(), "model", null);
        setIntField(term306617, term306617.getClass(), "currentState", 0);
        setIntField(term306617, term306617.getClass(), "currentCharLen", 0);
        setIntField(term306617, term306617.getClass(), "currentBytePos", 0);
        setField(term306616, term306616.getClass(), "codingSM", term306617);
        setField(term306616, term306616.getClass(), "state", enum37);
        setIntField(term306616, term306616.getClass(), "numOfMBChar", 0);
        setBooleanField(term306616, term306616.getClass(), "active", true);
        Object term306623 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Big5Prober"));
        Object term306624 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term306628 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.Big5DistributionAnalysis"));
        byte[] term306632 = (byte[]) newByteArray(2);
        setField(term306624, term306624.getClass(), "model", null);
        setIntField(term306624, term306624.getClass(), "currentState", 0);
        setIntField(term306624, term306624.getClass(), "currentCharLen", 0);
        setIntField(term306624, term306624.getClass(), "currentBytePos", 0);
        setField(term306623, term306623.getClass(), "codingSM", term306624);
        setField(term306623, term306623.getClass(), "state", enum37);
        setIntField(term306628, term306628.getClass(), "freqChars", 0);
        setIntField(term306628, term306628.getClass(), "totalChars", 0);
        setField(term306628, term306628.getClass(), "charToFreqOrder", null);
        setFloatField(term306628, term306628.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term306623, term306623.getClass(), "distributionAnalyzer", term306628);
        setField(term306623, term306623.getClass(), "lastChar", term306632);
        setBooleanField(term306623, term306623.getClass(), "active", true);
        Object term306636 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SJISProber"));
        Object term306637 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term306641 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis"));
        Object term306646 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.SJISDistributionAnalysis"));
        byte[] term306650 = (byte[]) newByteArray(2);
        setField(term306637, term306637.getClass(), "model", null);
        setIntField(term306637, term306637.getClass(), "currentState", 0);
        setIntField(term306637, term306637.getClass(), "currentCharLen", 0);
        setIntField(term306637, term306637.getClass(), "currentBytePos", 0);
        setField(term306636, term306636.getClass(), "codingSM", term306637);
        setField(term306636, term306636.getClass(), "state", enum37);
        setField(term306641, term306641.getClass(), "relSample", null);
        setIntField(term306641, term306641.getClass(), "totalRel", 0);
        setIntField(term306641, term306641.getClass(), "lastCharOrder", -1);
        setIntField(term306641, term306641.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term306641, term306641.getClass(), "done", false);
        setField(term306641, term306641.getClass(), "tmpOrder", null);
        setField(term306636, term306636.getClass(), "contextAnalyzer", term306641);
        setIntField(term306646, term306646.getClass(), "freqChars", 0);
        setIntField(term306646, term306646.getClass(), "totalChars", 0);
        setField(term306646, term306646.getClass(), "charToFreqOrder", null);
        setFloatField(term306646, term306646.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term306636, term306636.getClass(), "distributionAnalyzer", term306646);
        setField(term306636, term306636.getClass(), "lastChar", term306650);
        setBooleanField(term306636, term306636.getClass(), "active", true);
        Object term306654 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCJPProber"));
        Object term306655 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term306659 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis"));
        Object term306664 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis"));
        byte[] term306668 = (byte[]) newByteArray(2);
        setField(term306655, term306655.getClass(), "model", null);
        setIntField(term306655, term306655.getClass(), "currentState", 0);
        setIntField(term306655, term306655.getClass(), "currentCharLen", 0);
        setIntField(term306655, term306655.getClass(), "currentBytePos", 0);
        setField(term306654, term306654.getClass(), "codingSM", term306655);
        setField(term306654, term306654.getClass(), "state", enum37);
        setField(term306659, term306659.getClass(), "relSample", null);
        setIntField(term306659, term306659.getClass(), "totalRel", 0);
        setIntField(term306659, term306659.getClass(), "lastCharOrder", -1);
        setIntField(term306659, term306659.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term306659, term306659.getClass(), "done", false);
        setField(term306659, term306659.getClass(), "tmpOrder", null);
        setField(term306654, term306654.getClass(), "contextAnalyzer", term306659);
        setIntField(term306664, term306664.getClass(), "freqChars", 0);
        setIntField(term306664, term306664.getClass(), "totalChars", 0);
        setField(term306664, term306664.getClass(), "charToFreqOrder", null);
        setFloatField(term306664, term306664.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term306654, term306654.getClass(), "distributionAnalyzer", term306664);
        setField(term306654, term306654.getClass(), "lastChar", term306668);
        setBooleanField(term306654, term306654.getClass(), "active", true);
        Object term306672 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCKRProber"));
        Object term306673 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term306677 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCKRDistributionAnalysis"));
        byte[] term306681 = (byte[]) newByteArray(2);
        setField(term306673, term306673.getClass(), "model", null);
        setIntField(term306673, term306673.getClass(), "currentState", 0);
        setIntField(term306673, term306673.getClass(), "currentCharLen", 0);
        setIntField(term306673, term306673.getClass(), "currentBytePos", 0);
        setField(term306672, term306672.getClass(), "codingSM", term306673);
        setField(term306672, term306672.getClass(), "state", enum37);
        setIntField(term306677, term306677.getClass(), "freqChars", 0);
        setIntField(term306677, term306677.getClass(), "totalChars", 0);
        setField(term306677, term306677.getClass(), "charToFreqOrder", null);
        setFloatField(term306677, term306677.getClass(), "typicalDistributionRatio", 6.0F);
        setField(term306672, term306672.getClass(), "distributionAnalyzer", term306677);
        setField(term306672, term306672.getClass(), "lastChar", term306681);
        setBooleanField(term306672, term306672.getClass(), "active", true);
        Object term306685 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCTWProber"));
        Object term306686 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term306690 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCTWDistributionAnalysis"));
        byte[] term306694 = (byte[]) newByteArray(2);
        setField(term306686, term306686.getClass(), "model", null);
        setIntField(term306686, term306686.getClass(), "currentState", 0);
        setIntField(term306686, term306686.getClass(), "currentCharLen", 0);
        setIntField(term306686, term306686.getClass(), "currentBytePos", 0);
        setField(term306685, term306685.getClass(), "codingSM", term306686);
        setField(term306685, term306685.getClass(), "state", enum37);
        setIntField(term306690, term306690.getClass(), "freqChars", 0);
        setIntField(term306690, term306690.getClass(), "totalChars", 0);
        setField(term306690, term306690.getClass(), "charToFreqOrder", null);
        setFloatField(term306690, term306690.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term306685, term306685.getClass(), "distributionAnalyzer", term306690);
        setField(term306685, term306685.getClass(), "lastChar", term306694);
        setBooleanField(term306685, term306685.getClass(), "active", true);
        ArrayList term306601 = new ArrayList();
        ((ArrayList) term306601).add(term306603);
        ((ArrayList) term306601).add(term306616);
        ((ArrayList) term306601).add(term306623);
        ((ArrayList) term306601).add(term306636);
        ((ArrayList) term306601).add(term306654);
        ((ArrayList) term306601).add(term306672);
        ((ArrayList) term306601).add(term306685);
        term306587 = newInstance(Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber"));
        setField(term306587, term306587.getClass(), "state", enum37);
        setField(term306587, term306587.getClass(), "probers", term306601);
        setField(term306587, term306587.getClass(), "bestGuess", null);
        setIntField(term306587, term306587.getClass(), "activeNum", 7);
        setBooleanField(term306587, term306587.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharSetName", argTypes, term306587, args);
    }

};


