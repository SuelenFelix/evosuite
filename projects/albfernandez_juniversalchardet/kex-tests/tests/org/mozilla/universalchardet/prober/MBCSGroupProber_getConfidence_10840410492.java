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

public class MBCSGroupProber_getConfidence_10840410492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307058;

    public MBCSGroupProber_getConfidence_10840410492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term307174 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term307173 = ((Class) term307174).getDeclaredField((String) "DETECTING");
        ((Field) term307173).setAccessible(true);
        Object enum38 = ((Field) term307173).get((Object) null);
        Object term307074 = newInstance(Class.forName("org.mozilla.universalchardet.prober.GB18030Prober"));
        Object term307075 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307079 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.GB2312DistributionAnalysis"));
        byte[] term307083 = (byte[]) newByteArray(2);
        setField(term307075, term307075.getClass(), "model", null);
        setIntField(term307075, term307075.getClass(), "currentState", 0);
        setIntField(term307075, term307075.getClass(), "currentCharLen", 0);
        setIntField(term307075, term307075.getClass(), "currentBytePos", 0);
        setField(term307074, term307074.getClass(), "codingSM", term307075);
        setField(term307074, term307074.getClass(), "state", enum38);
        setIntField(term307079, term307079.getClass(), "freqChars", 0);
        setIntField(term307079, term307079.getClass(), "totalChars", 0);
        setField(term307079, term307079.getClass(), "charToFreqOrder", null);
        setFloatField(term307079, term307079.getClass(), "typicalDistributionRatio", 0.9F);
        setField(term307074, term307074.getClass(), "distributionAnalyzer", term307079);
        setField(term307074, term307074.getClass(), "lastChar", term307083);
        setBooleanField(term307074, term307074.getClass(), "active", true);
        Object term307087 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term307088 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        setField(term307088, term307088.getClass(), "model", null);
        setIntField(term307088, term307088.getClass(), "currentState", 0);
        setIntField(term307088, term307088.getClass(), "currentCharLen", 0);
        setIntField(term307088, term307088.getClass(), "currentBytePos", 0);
        setField(term307087, term307087.getClass(), "codingSM", term307088);
        setField(term307087, term307087.getClass(), "state", enum38);
        setIntField(term307087, term307087.getClass(), "numOfMBChar", 0);
        setBooleanField(term307087, term307087.getClass(), "active", true);
        Object term307094 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Big5Prober"));
        Object term307095 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307099 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.Big5DistributionAnalysis"));
        byte[] term307103 = (byte[]) newByteArray(2);
        setField(term307095, term307095.getClass(), "model", null);
        setIntField(term307095, term307095.getClass(), "currentState", 0);
        setIntField(term307095, term307095.getClass(), "currentCharLen", 0);
        setIntField(term307095, term307095.getClass(), "currentBytePos", 0);
        setField(term307094, term307094.getClass(), "codingSM", term307095);
        setField(term307094, term307094.getClass(), "state", enum38);
        setIntField(term307099, term307099.getClass(), "freqChars", 0);
        setIntField(term307099, term307099.getClass(), "totalChars", 0);
        setField(term307099, term307099.getClass(), "charToFreqOrder", null);
        setFloatField(term307099, term307099.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term307094, term307094.getClass(), "distributionAnalyzer", term307099);
        setField(term307094, term307094.getClass(), "lastChar", term307103);
        setBooleanField(term307094, term307094.getClass(), "active", true);
        Object term307107 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SJISProber"));
        Object term307108 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307112 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis"));
        Object term307117 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.SJISDistributionAnalysis"));
        byte[] term307121 = (byte[]) newByteArray(2);
        setField(term307108, term307108.getClass(), "model", null);
        setIntField(term307108, term307108.getClass(), "currentState", 0);
        setIntField(term307108, term307108.getClass(), "currentCharLen", 0);
        setIntField(term307108, term307108.getClass(), "currentBytePos", 0);
        setField(term307107, term307107.getClass(), "codingSM", term307108);
        setField(term307107, term307107.getClass(), "state", enum38);
        setField(term307112, term307112.getClass(), "relSample", null);
        setIntField(term307112, term307112.getClass(), "totalRel", 0);
        setIntField(term307112, term307112.getClass(), "lastCharOrder", -1);
        setIntField(term307112, term307112.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term307112, term307112.getClass(), "done", false);
        setField(term307112, term307112.getClass(), "tmpOrder", null);
        setField(term307107, term307107.getClass(), "contextAnalyzer", term307112);
        setIntField(term307117, term307117.getClass(), "freqChars", 0);
        setIntField(term307117, term307117.getClass(), "totalChars", 0);
        setField(term307117, term307117.getClass(), "charToFreqOrder", null);
        setFloatField(term307117, term307117.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term307107, term307107.getClass(), "distributionAnalyzer", term307117);
        setField(term307107, term307107.getClass(), "lastChar", term307121);
        setBooleanField(term307107, term307107.getClass(), "active", true);
        Object term307125 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCJPProber"));
        Object term307126 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307130 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis"));
        Object term307135 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis"));
        byte[] term307139 = (byte[]) newByteArray(2);
        setField(term307126, term307126.getClass(), "model", null);
        setIntField(term307126, term307126.getClass(), "currentState", 0);
        setIntField(term307126, term307126.getClass(), "currentCharLen", 0);
        setIntField(term307126, term307126.getClass(), "currentBytePos", 0);
        setField(term307125, term307125.getClass(), "codingSM", term307126);
        setField(term307125, term307125.getClass(), "state", enum38);
        setField(term307130, term307130.getClass(), "relSample", null);
        setIntField(term307130, term307130.getClass(), "totalRel", 0);
        setIntField(term307130, term307130.getClass(), "lastCharOrder", -1);
        setIntField(term307130, term307130.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term307130, term307130.getClass(), "done", false);
        setField(term307130, term307130.getClass(), "tmpOrder", null);
        setField(term307125, term307125.getClass(), "contextAnalyzer", term307130);
        setIntField(term307135, term307135.getClass(), "freqChars", 0);
        setIntField(term307135, term307135.getClass(), "totalChars", 0);
        setField(term307135, term307135.getClass(), "charToFreqOrder", null);
        setFloatField(term307135, term307135.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term307125, term307125.getClass(), "distributionAnalyzer", term307135);
        setField(term307125, term307125.getClass(), "lastChar", term307139);
        setBooleanField(term307125, term307125.getClass(), "active", true);
        Object term307143 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCKRProber"));
        Object term307144 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307148 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCKRDistributionAnalysis"));
        byte[] term307152 = (byte[]) newByteArray(2);
        setField(term307144, term307144.getClass(), "model", null);
        setIntField(term307144, term307144.getClass(), "currentState", 0);
        setIntField(term307144, term307144.getClass(), "currentCharLen", 0);
        setIntField(term307144, term307144.getClass(), "currentBytePos", 0);
        setField(term307143, term307143.getClass(), "codingSM", term307144);
        setField(term307143, term307143.getClass(), "state", enum38);
        setIntField(term307148, term307148.getClass(), "freqChars", 0);
        setIntField(term307148, term307148.getClass(), "totalChars", 0);
        setField(term307148, term307148.getClass(), "charToFreqOrder", null);
        setFloatField(term307148, term307148.getClass(), "typicalDistributionRatio", 6.0F);
        setField(term307143, term307143.getClass(), "distributionAnalyzer", term307148);
        setField(term307143, term307143.getClass(), "lastChar", term307152);
        setBooleanField(term307143, term307143.getClass(), "active", true);
        Object term307156 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCTWProber"));
        Object term307157 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term307161 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCTWDistributionAnalysis"));
        byte[] term307165 = (byte[]) newByteArray(2);
        setField(term307157, term307157.getClass(), "model", null);
        setIntField(term307157, term307157.getClass(), "currentState", 0);
        setIntField(term307157, term307157.getClass(), "currentCharLen", 0);
        setIntField(term307157, term307157.getClass(), "currentBytePos", 0);
        setField(term307156, term307156.getClass(), "codingSM", term307157);
        setField(term307156, term307156.getClass(), "state", enum38);
        setIntField(term307161, term307161.getClass(), "freqChars", 0);
        setIntField(term307161, term307161.getClass(), "totalChars", 0);
        setField(term307161, term307161.getClass(), "charToFreqOrder", null);
        setFloatField(term307161, term307161.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term307156, term307156.getClass(), "distributionAnalyzer", term307161);
        setField(term307156, term307156.getClass(), "lastChar", term307165);
        setBooleanField(term307156, term307156.getClass(), "active", true);
        ArrayList term307072 = new ArrayList();
        ((ArrayList) term307072).add(term307074);
        ((ArrayList) term307072).add(term307087);
        ((ArrayList) term307072).add(term307094);
        ((ArrayList) term307072).add(term307107);
        ((ArrayList) term307072).add(term307125);
        ((ArrayList) term307072).add(term307143);
        ((ArrayList) term307072).add(term307156);
        term307058 = newInstance(Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber"));
        setField(term307058, term307058.getClass(), "state", enum38);
        setField(term307058, term307058.getClass(), "probers", term307072);
        setField(term307058, term307058.getClass(), "bestGuess", null);
        setIntField(term307058, term307058.getClass(), "activeNum", 7);
        setBooleanField(term307058, term307058.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term307058, args);
    }

};


