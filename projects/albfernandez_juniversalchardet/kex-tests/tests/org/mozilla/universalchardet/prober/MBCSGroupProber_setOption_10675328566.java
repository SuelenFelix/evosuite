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

public class MBCSGroupProber_setOption_10675328566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308961;

    public MBCSGroupProber_setOption_10675328566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term309077 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term309076 = ((Class) term309077).getDeclaredField((String) "DETECTING");
        ((Field) term309076).setAccessible(true);
        Object enum42 = ((Field) term309076).get((Object) null);
        Object term308977 = newInstance(Class.forName("org.mozilla.universalchardet.prober.GB18030Prober"));
        Object term308978 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term308982 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.GB2312DistributionAnalysis"));
        byte[] term308986 = (byte[]) newByteArray(2);
        setField(term308978, term308978.getClass(), "model", null);
        setIntField(term308978, term308978.getClass(), "currentState", 0);
        setIntField(term308978, term308978.getClass(), "currentCharLen", 0);
        setIntField(term308978, term308978.getClass(), "currentBytePos", 0);
        setField(term308977, term308977.getClass(), "codingSM", term308978);
        setField(term308977, term308977.getClass(), "state", enum42);
        setIntField(term308982, term308982.getClass(), "freqChars", 0);
        setIntField(term308982, term308982.getClass(), "totalChars", 0);
        setField(term308982, term308982.getClass(), "charToFreqOrder", null);
        setFloatField(term308982, term308982.getClass(), "typicalDistributionRatio", 0.9F);
        setField(term308977, term308977.getClass(), "distributionAnalyzer", term308982);
        setField(term308977, term308977.getClass(), "lastChar", term308986);
        setBooleanField(term308977, term308977.getClass(), "active", true);
        Object term308990 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        Object term308991 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        setField(term308991, term308991.getClass(), "model", null);
        setIntField(term308991, term308991.getClass(), "currentState", 0);
        setIntField(term308991, term308991.getClass(), "currentCharLen", 0);
        setIntField(term308991, term308991.getClass(), "currentBytePos", 0);
        setField(term308990, term308990.getClass(), "codingSM", term308991);
        setField(term308990, term308990.getClass(), "state", enum42);
        setIntField(term308990, term308990.getClass(), "numOfMBChar", 0);
        setBooleanField(term308990, term308990.getClass(), "active", true);
        Object term308997 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Big5Prober"));
        Object term308998 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309002 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.Big5DistributionAnalysis"));
        byte[] term309006 = (byte[]) newByteArray(2);
        setField(term308998, term308998.getClass(), "model", null);
        setIntField(term308998, term308998.getClass(), "currentState", 0);
        setIntField(term308998, term308998.getClass(), "currentCharLen", 0);
        setIntField(term308998, term308998.getClass(), "currentBytePos", 0);
        setField(term308997, term308997.getClass(), "codingSM", term308998);
        setField(term308997, term308997.getClass(), "state", enum42);
        setIntField(term309002, term309002.getClass(), "freqChars", 0);
        setIntField(term309002, term309002.getClass(), "totalChars", 0);
        setField(term309002, term309002.getClass(), "charToFreqOrder", null);
        setFloatField(term309002, term309002.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term308997, term308997.getClass(), "distributionAnalyzer", term309002);
        setField(term308997, term308997.getClass(), "lastChar", term309006);
        setBooleanField(term308997, term308997.getClass(), "active", true);
        Object term309010 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SJISProber"));
        Object term309011 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309015 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis"));
        Object term309020 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.SJISDistributionAnalysis"));
        byte[] term309024 = (byte[]) newByteArray(2);
        setField(term309011, term309011.getClass(), "model", null);
        setIntField(term309011, term309011.getClass(), "currentState", 0);
        setIntField(term309011, term309011.getClass(), "currentCharLen", 0);
        setIntField(term309011, term309011.getClass(), "currentBytePos", 0);
        setField(term309010, term309010.getClass(), "codingSM", term309011);
        setField(term309010, term309010.getClass(), "state", enum42);
        setField(term309015, term309015.getClass(), "relSample", null);
        setIntField(term309015, term309015.getClass(), "totalRel", 0);
        setIntField(term309015, term309015.getClass(), "lastCharOrder", -1);
        setIntField(term309015, term309015.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term309015, term309015.getClass(), "done", false);
        setField(term309015, term309015.getClass(), "tmpOrder", null);
        setField(term309010, term309010.getClass(), "contextAnalyzer", term309015);
        setIntField(term309020, term309020.getClass(), "freqChars", 0);
        setIntField(term309020, term309020.getClass(), "totalChars", 0);
        setField(term309020, term309020.getClass(), "charToFreqOrder", null);
        setFloatField(term309020, term309020.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term309010, term309010.getClass(), "distributionAnalyzer", term309020);
        setField(term309010, term309010.getClass(), "lastChar", term309024);
        setBooleanField(term309010, term309010.getClass(), "active", true);
        Object term309028 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCJPProber"));
        Object term309029 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309033 = newInstance(Class.forName("org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis"));
        Object term309038 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis"));
        byte[] term309042 = (byte[]) newByteArray(2);
        setField(term309029, term309029.getClass(), "model", null);
        setIntField(term309029, term309029.getClass(), "currentState", 0);
        setIntField(term309029, term309029.getClass(), "currentCharLen", 0);
        setIntField(term309029, term309029.getClass(), "currentBytePos", 0);
        setField(term309028, term309028.getClass(), "codingSM", term309029);
        setField(term309028, term309028.getClass(), "state", enum42);
        setField(term309033, term309033.getClass(), "relSample", null);
        setIntField(term309033, term309033.getClass(), "totalRel", 0);
        setIntField(term309033, term309033.getClass(), "lastCharOrder", -1);
        setIntField(term309033, term309033.getClass(), "needToSkipCharNum", 0);
        setBooleanField(term309033, term309033.getClass(), "done", false);
        setField(term309033, term309033.getClass(), "tmpOrder", null);
        setField(term309028, term309028.getClass(), "contextAnalyzer", term309033);
        setIntField(term309038, term309038.getClass(), "freqChars", 0);
        setIntField(term309038, term309038.getClass(), "totalChars", 0);
        setField(term309038, term309038.getClass(), "charToFreqOrder", null);
        setFloatField(term309038, term309038.getClass(), "typicalDistributionRatio", 3.0F);
        setField(term309028, term309028.getClass(), "distributionAnalyzer", term309038);
        setField(term309028, term309028.getClass(), "lastChar", term309042);
        setBooleanField(term309028, term309028.getClass(), "active", true);
        Object term309046 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCKRProber"));
        Object term309047 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309051 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCKRDistributionAnalysis"));
        byte[] term309055 = (byte[]) newByteArray(2);
        setField(term309047, term309047.getClass(), "model", null);
        setIntField(term309047, term309047.getClass(), "currentState", 0);
        setIntField(term309047, term309047.getClass(), "currentCharLen", 0);
        setIntField(term309047, term309047.getClass(), "currentBytePos", 0);
        setField(term309046, term309046.getClass(), "codingSM", term309047);
        setField(term309046, term309046.getClass(), "state", enum42);
        setIntField(term309051, term309051.getClass(), "freqChars", 0);
        setIntField(term309051, term309051.getClass(), "totalChars", 0);
        setField(term309051, term309051.getClass(), "charToFreqOrder", null);
        setFloatField(term309051, term309051.getClass(), "typicalDistributionRatio", 6.0F);
        setField(term309046, term309046.getClass(), "distributionAnalyzer", term309051);
        setField(term309046, term309046.getClass(), "lastChar", term309055);
        setBooleanField(term309046, term309046.getClass(), "active", true);
        Object term309059 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCTWProber"));
        Object term309060 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        Object term309064 = newInstance(Class.forName("org.mozilla.universalchardet.prober.distributionanalysis.EUCTWDistributionAnalysis"));
        byte[] term309068 = (byte[]) newByteArray(2);
        setField(term309060, term309060.getClass(), "model", null);
        setIntField(term309060, term309060.getClass(), "currentState", 0);
        setIntField(term309060, term309060.getClass(), "currentCharLen", 0);
        setIntField(term309060, term309060.getClass(), "currentBytePos", 0);
        setField(term309059, term309059.getClass(), "codingSM", term309060);
        setField(term309059, term309059.getClass(), "state", enum42);
        setIntField(term309064, term309064.getClass(), "freqChars", 0);
        setIntField(term309064, term309064.getClass(), "totalChars", 0);
        setField(term309064, term309064.getClass(), "charToFreqOrder", null);
        setFloatField(term309064, term309064.getClass(), "typicalDistributionRatio", 0.75F);
        setField(term309059, term309059.getClass(), "distributionAnalyzer", term309064);
        setField(term309059, term309059.getClass(), "lastChar", term309068);
        setBooleanField(term309059, term309059.getClass(), "active", true);
        ArrayList term308975 = new ArrayList();
        ((ArrayList) term308975).add(term308977);
        ((ArrayList) term308975).add(term308990);
        ((ArrayList) term308975).add(term308997);
        ((ArrayList) term308975).add(term309010);
        ((ArrayList) term308975).add(term309028);
        ((ArrayList) term308975).add(term309046);
        ((ArrayList) term308975).add(term309059);
        term308961 = newInstance(Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber"));
        setField(term308961, term308961.getClass(), "state", enum42);
        setField(term308961, term308961.getClass(), "probers", term308975);
        setField(term308961, term308961.getClass(), "bestGuess", null);
        setIntField(term308961, term308961.getClass(), "activeNum", 7);
        setBooleanField(term308961, term308961.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOption", argTypes, term308961, args);
    }

};


