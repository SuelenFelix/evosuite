package zowe.client.sdk.zosjobs.model;

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
import static zowe.client.sdk.zosjobs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Job_getUrl_168705239814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16619;

    public Job_getUrl_168705239814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16731 = new Long(7489064039921396098L);
        Long term16819 = new Long(6843866297465638866L);
        Long term16907 = new Long(-4023935540989049732L);
        Long term16995 = new Long(855932984568615096L);
        Long term17083 = new Long(-1616722610139554082L);
        Long term17193 = new Long(7495904023107549024L);
        term16619 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term16716 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term16717 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term16805 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term16893 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term16981 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term17069 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term16619, term16619.getClass(), "jobId", "ktKcSZiuGM");
        setField(term16619, term16619.getClass(), "jobName", "PSOttyUeqv");
        setField(term16619, term16619.getClass(), "subSystem", "HmEvTlmzXo");
        setField(term16619, term16619.getClass(), "owner", "BMMonTIZgJ");
        setField(term16619, term16619.getClass(), "status", "QXyFXBjFde");
        setField(term16619, term16619.getClass(), "type", "xVFgeyYxZS");
        setField(term16619, term16619.getClass(), "classs", "iQiGTulJiH");
        setField(term16619, term16619.getClass(), "retCode", "utCuuVCKqE");
        setBooleanField(term16717, term16717.getClass(), "active", false);
        setField(term16717, term16717.getClass(), "smfid", "zSfoqzJbPT");
        setField(term16717, term16717.getClass(), "stepNumber", term16731);
        setField(term16717, term16717.getClass(), "owner", "QUymMnsCIj");
        setField(term16717, term16717.getClass(), "programName", "ikTtOgdVYS");
        setField(term16717, term16717.getClass(), "stepName", "JptuwlirlS");
        setField(term16717, term16717.getClass(), "pathName", "TKOMaGswbU");
        setField(term16717, term16717.getClass(), "procStepName", "YcTbglHiUq");
        setField(term16717, term16717.getClass(), "completion", "TiUqHrjoEU");
        setElement(term16716, 0, term16717);
        setBooleanField(term16805, term16805.getClass(), "active", true);
        setField(term16805, term16805.getClass(), "smfid", "eoEvZbdLjL");
        setField(term16805, term16805.getClass(), "stepNumber", term16819);
        setField(term16805, term16805.getClass(), "owner", "BkIxsyPkGy");
        setField(term16805, term16805.getClass(), "programName", "mrMGwoRgVY");
        setField(term16805, term16805.getClass(), "stepName", "mxVLTgCwki");
        setField(term16805, term16805.getClass(), "pathName", "wCurppnDSA");
        setField(term16805, term16805.getClass(), "procStepName", "JydxSNTMYt");
        setField(term16805, term16805.getClass(), "completion", "KpurAcrHYT");
        setElement(term16716, 1, term16805);
        setBooleanField(term16893, term16893.getClass(), "active", false);
        setField(term16893, term16893.getClass(), "smfid", "QjvDwgKJGz");
        setField(term16893, term16893.getClass(), "stepNumber", term16907);
        setField(term16893, term16893.getClass(), "owner", "ngYxiXTZrk");
        setField(term16893, term16893.getClass(), "programName", "YTxBqWRAlo");
        setField(term16893, term16893.getClass(), "stepName", "ReruUQRXwl");
        setField(term16893, term16893.getClass(), "pathName", "DWEsVQwuaE");
        setField(term16893, term16893.getClass(), "procStepName", "qGkNzZAeDN");
        setField(term16893, term16893.getClass(), "completion", "wdtiuPgTVJ");
        setElement(term16716, 2, term16893);
        setBooleanField(term16981, term16981.getClass(), "active", false);
        setField(term16981, term16981.getClass(), "smfid", "HUgzMgrpsK");
        setField(term16981, term16981.getClass(), "stepNumber", term16995);
        setField(term16981, term16981.getClass(), "owner", "ubaBUfLolu");
        setField(term16981, term16981.getClass(), "programName", "itAUCFhZhq");
        setField(term16981, term16981.getClass(), "stepName", "bIqaKgXgPm");
        setField(term16981, term16981.getClass(), "pathName", "uOJFOUcNvv");
        setField(term16981, term16981.getClass(), "procStepName", "tkmmGweDwJ");
        setField(term16981, term16981.getClass(), "completion", "pMfTuAFXxg");
        setElement(term16716, 3, term16981);
        setBooleanField(term17069, term17069.getClass(), "active", false);
        setField(term17069, term17069.getClass(), "smfid", "XCZmhkblRc");
        setField(term17069, term17069.getClass(), "stepNumber", term17083);
        setField(term17069, term17069.getClass(), "owner", "gFUWMydGCU");
        setField(term17069, term17069.getClass(), "programName", "LLegSTfqJt");
        setField(term17069, term17069.getClass(), "stepName", "XQfmqLbqHS");
        setField(term17069, term17069.getClass(), "pathName", "jLVLqQSjqg");
        setField(term17069, term17069.getClass(), "procStepName", "JKGueoHesL");
        setField(term17069, term17069.getClass(), "completion", "CRAUqtVBkU");
        setElement(term16716, 4, term17069);
        setField(term16619, term16619.getClass(), "stepData", term16716);
        setField(term16619, term16619.getClass(), "url", "DddqUYfomL");
        setField(term16619, term16619.getClass(), "filesUrl", "YQwoogpPyi");
        setField(term16619, term16619.getClass(), "jobCorrelator", "rnPhHoorxj");
        setField(term16619, term16619.getClass(), "phase", term17193);
        setField(term16619, term16619.getClass(), "phaseName", "GuwJLKquuI");
        setField(term16619, term16619.getClass(), "execSystem", "vYMCjgnztg");
        setField(term16619, term16619.getClass(), "execMember", "YupgKTSEiI");
        setField(term16619, term16619.getClass(), "execSubmitted", "HuOUlaFmvJ");
        setField(term16619, term16619.getClass(), "execStarted", "dWVwcwFGNo");
        setField(term16619, term16619.getClass(), "execEnded", "PNdLRrSAIY");
        setField(term16619, term16619.getClass(), "reasonNotRunning", "nJnRIRiLZK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term16619, args);
    }

};


