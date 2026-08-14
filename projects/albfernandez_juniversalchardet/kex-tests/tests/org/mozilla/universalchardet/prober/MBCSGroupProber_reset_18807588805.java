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

public class MBCSGroupProber_reset_18807588805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308490;

    public MBCSGroupProber_reset_18807588805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term308606 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term308605 = ((Class) term308606).getDeclaredField((String) "DETECTING");
        ((Field) term308605).setAccessible(true);
        Object enum41 = ((Field) term308605).get((Object) null);
        Object term308506 = newInstance(Class.forName("org.mozilla.universalchardet.prober.GB18030Prober"));
        Object term308507 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term308511 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.GB2312DistributionAnalysis"));
        byte[] term308515 = (byte[]) newByteArray(2);
        setField(term308507, term308507.getClass(), "model", null);
        setIntField(term308507, term308507.getClass(), "currentState", 0);
        setIntField(term308507, term308507.getClass(), "currentCharLen", 0);
        setIntField(term308507, term308507.getClass(), "currentBytePos", 0);
        setField(term308506, term308506.getClass(), "codingSM", term308507);
        setField(term308506, term308506.getClass(), "state", enum41);
        setIntField(term308511, term308511.getClass(), "freqChars", 0);
        setIntField(term308511, term308511.getClass(), "totalChars", 0);
        setField(term308511, term308511.getClass(), "charToFreqOrder", null);
        setFloatField(term308511, term308511.getClass(), "typicalDistributionRatio", 0.9F);
        setField(term308506, term308506.getClass(), "distributionAnalyzer", term308511);
        setField(term308506, term308506.getClass(), "lastChar", term308515);
        setBooleanField(term308506, term308506.getClass(), "active", true);
        Object term308519 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term308520 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        setField(term308520, term308520.getClass(), "model", null);
        setIntField(term308520, term308520.getClass(), "currentState", 0);
        setIntField(term308520, term308520.getClass(), "currentCharLen", 0);
        setIntField(term308520, term308520.getClass(), "currentBytePos", 0);
        setField(term308519, term308519.getClass(), "codingSM", term308520);
        setField(term308519, term308519.getClass(), "state", enum41);
        setIntField(term308519, term308519.getClass(), "numOfMBChar", 0);
        setBooleanField(term308519, term308519.getClass(), "active", true);
        Object term308526 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Big5Prober"));
        Object term308527 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term308531 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.Big5DistributionAnalysis"));
        byte[] term308535 = (byte[]) newByteArray(2);
        setField(term308527, term308527.getClass(), "model", null);
        setIntField(term308527, term308527.getClass(), "currentState", 0);
        setIntField(term308527, term308527.getClass(), "currentCharLen", 0);
        setIntField(term308527, term308527.getClass(), "currentBytePos", 0);
        setField(term308526, term308526.getClass(), "codingSM", term308527);
        setField(term308526, term308526.getClass(), "state", enum41);
        setIntField(term308531, term308531.getClass(), "freqChars", 0);
        setIntField(term308531, term308531.getClass(), "totalChars", 0);
        setField(term308531, term308531.getClass(), "charToFreqOrder", null);
        setFloatField(term308531, term308531.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term308526, term308526.getClass(), "distributionAnalyzer", term308531);
        setField(term308526, term308526.getClass(), "lastChar", term308535);
        setBooleanField(term308526, term308526.getClass(), "active", true);
        Object term308539 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SJISProber"));
        Object term308540 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term308544 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis"));
        Object term308549 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.SJISDistributionAnalysis"));
        byte[] term308553 = (byte[]) newByteArray(2);
        setField(term308540, term308540.getClass(), "model", null);
        setIntField(term308540, term308540.getClass(), "currentState", 0);
        setIntField(term308540, term308540.getClass(), "currentCharLen", 0);
        setIntField(term308540, term308540.getClass(), "currentBytePos", 0);
        setField(term308539, term308539.getClass(), "codingSM", term308540);
        setField(term308539, term308539.getClass(), "state", enum41);
        setField(term308544, term308544.getClass(), "relSample", null);
        setIntField(term308544, term308544.getClass(), "totalRel", 0);
        setIntField(term308544, term308544.getClass(), "lastCharOrder", -1);
        setIntField(term308544, term308544.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term308544, term308544.getClass(), "done", false);
        setField(term308544, term308544.getClass(), "tmpOrder", null);
        setField(term308539, term308539.getClass(), "contextAnalyzer", term308544);
        setIntField(term308549, term308549.getClass(), "freqChars", 0);
        setIntField(term308549, term308549.getClass(), "totalChars", 0);
        setField(term308549, term308549.getClass(), "charToFreqOrder", null);
        setFloatField(term308549, term308549.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term308539, term308539.getClass(), "distributionAnalyzer", term308549);
        setField(term308539, term308539.getClass(), "lastChar", term308553);
        setBooleanField(term308539, term308539.getClass(), "active", true);
        Object term308557 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCJPProber"));
        Object term308558 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term308562 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis"));
        Object term308567 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis"));
        byte[] term308571 = (byte[]) newByteArray(2);
        setField(term308558, term308558.getClass(), "model", null);
        setIntField(term308558, term308558.getClass(), "currentState", 0);
        setIntField(term308558, term308558.getClass(), "currentCharLen", 0);
        setIntField(term308558, term308558.getClass(), "currentBytePos", 0);
        setField(term308557, term308557.getClass(), "codingSM", term308558);
        setField(term308557, term308557.getClass(), "state", enum41);
        setField(term308562, term308562.getClass(), "relSample", null);
        setIntField(term308562, term308562.getClass(), "totalRel", 0);
        setIntField(term308562, term308562.getClass(), "lastCharOrder", -1);
        setIntField(term308562, term308562.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term308562, term308562.getClass(), "done", false);
        setField(term308562, term308562.getClass(), "tmpOrder", null);
        setField(term308557, term308557.getClass(), "contextAnalyzer", term308562);
        setIntField(term308567, term308567.getClass(), "freqChars", 0);
        setIntField(term308567, term308567.getClass(), "totalChars", 0);
        setField(term308567, term308567.getClass(), "charToFreqOrder", null);
        setFloatField(term308567, term308567.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term308557, term308557.getClass(), "distributionAnalyzer", term308567);
        setField(term308557, term308557.getClass(), "lastChar", term308571);
        setBooleanField(term308557, term308557.getClass(), "active", true);
        Object term308575 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCKRProber"));
        Object term308576 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term308580 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCKRDistributionAnalysis"));
        byte[] term308584 = (byte[]) newByteArray(2);
        setField(term308576, term308576.getClass(), "model", null);
        setIntField(term308576, term308576.getClass(), "currentState", 0);
        setIntField(term308576, term308576.getClass(), "currentCharLen", 0);
        setIntField(term308576, term308576.getClass(), "currentBytePos", 0);
        setField(term308575, term308575.getClass(), "codingSM", term308576);
        setField(term308575, term308575.getClass(), "state", enum41);
        setIntField(term308580, term308580.getClass(), "freqChars", 0);
        setIntField(term308580, term308580.getClass(), "totalChars", 0);
        setField(term308580, term308580.getClass(), "charToFreqOrder", null);
        setFloatField(term308580, term308580.getClass(), "typicalDistributionRatio", 6.0F);
        setField(term308575, term308575.getClass(), "distributionAnalyzer", term308580);
        setField(term308575, term308575.getClass(), "lastChar", term308584);
        setBooleanField(term308575, term308575.getClass(), "active", true);
        Object term308588 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCTWProber"));
        Object term308589 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term308593 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCTWDistributionAnalysis"));
        byte[] term308597 = (byte[]) newByteArray(2);
        setField(term308589, term308589.getClass(), "model", null);
        setIntField(term308589, term308589.getClass(), "currentState", 0);
        setIntField(term308589, term308589.getClass(), "currentCharLen", 0);
        setIntField(term308589, term308589.getClass(), "currentBytePos", 0);
        setField(term308588, term308588.getClass(), "codingSM", term308589);
        setField(term308588, term308588.getClass(), "state", enum41);
        setIntField(term308593, term308593.getClass(), "freqChars", 0);
        setIntField(term308593, term308593.getClass(), "totalChars", 0);
        setField(term308593, term308593.getClass(), "charToFreqOrder", null);
        setFloatField(term308593, term308593.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term308588, term308588.getClass(), "distributionAnalyzer", term308593);
        setField(term308588, term308588.getClass(), "lastChar", term308597);
        setBooleanField(term308588, term308588.getClass(), "active", true);
        ArrayList term308504 = new ArrayList();
        ((ArrayList) term308504).add(term308506);
        ((ArrayList) term308504).add(term308519);
        ((ArrayList) term308504).add(term308526);
        ((ArrayList) term308504).add(term308539);
        ((ArrayList) term308504).add(term308557);
        ((ArrayList) term308504).add(term308575);
        ((ArrayList) term308504).add(term308588);
        term308490 = newInstance(Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber"));
        setField(term308490, term308490.getClass(), "state", enum41);
        setField(term308490, term308490.getClass(), "probers", term308504);
        setField(term308490, term308490.getClass(), "bestGuess", null);
        setIntField(term308490, term308490.getClass(), "activeNum", 7);
        setBooleanField(term308490, term308490.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term308490, args);
    }

};


