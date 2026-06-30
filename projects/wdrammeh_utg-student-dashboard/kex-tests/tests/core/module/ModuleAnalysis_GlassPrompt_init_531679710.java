package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ModuleAnalysis_GlassPrompt_init_531679710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33410;

    public ModuleAnalysis_GlassPrompt_init_531679710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33412 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term33412, term33412.getClass(), "score", 0.7031006357544823);
        setField(term33412, term33412.getClass(), "code", "lihXWlGDxk");
        setField(term33412, term33412.getClass(), "name", "JmcmxoGhIK");
        setField(term33412, term33412.getClass(), "year", "jXzmYyrnnT");
        setField(term33412, term33412.getClass(), "semester", "igCAtimmYB");
        setField(term33412, term33412.getClass(), "lecturer", "DyiXbeYIaN");
        setBooleanField(term33412, term33412.getClass(), "isLecturerEditable", false);
        setField(term33412, term33412.getClass(), "campus", "VGizxZnyHX");
        setField(term33412, term33412.getClass(), "room", "kVEZMHmRtR");
        setField(term33412, term33412.getClass(), "day", "ekxGuOYIwi");
        setField(term33412, term33412.getClass(), "time", "RbVQXSpxXy");
        setField(term33412, term33412.getClass(), "requirement", "YpJbIgJWWv");
        setIntField(term33412, term33412.getClass(), "creditHours", -1002370457);
        setBooleanField(term33412, term33412.getClass(), "isConfirmed", false);
        setField(term33412, term33412.getClass(), "status", "JppkknKVOw");
        Object term33549 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term33549, term33549.getClass(), "score", 0.9527281779865117);
        setField(term33549, term33549.getClass(), "code", "iljANwuEjk");
        setField(term33549, term33549.getClass(), "name", "kNqaJKIATy");
        setField(term33549, term33549.getClass(), "year", "vKQukfbJUd");
        setField(term33549, term33549.getClass(), "semester", "lFRJFUMVbx");
        setField(term33549, term33549.getClass(), "lecturer", "sZdUNdggUW");
        setBooleanField(term33549, term33549.getClass(), "isLecturerEditable", true);
        setField(term33549, term33549.getClass(), "campus", "OqbwYQfvAe");
        setField(term33549, term33549.getClass(), "room", "tRxZafjqIx");
        setField(term33549, term33549.getClass(), "day", "DhjNLmRMCu");
        setField(term33549, term33549.getClass(), "time", "PgPzMSEjjX");
        setField(term33549, term33549.getClass(), "requirement", "wzsPSPcRdj");
        setIntField(term33549, term33549.getClass(), "creditHours", -2014576105);
        setBooleanField(term33549, term33549.getClass(), "isConfirmed", true);
        setField(term33549, term33549.getClass(), "status", "kGMQdqJYyB");
        Object term33686 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term33686, term33686.getClass(), "score", 0.9828442029246764);
        setField(term33686, term33686.getClass(), "code", "XJJNClzHRf");
        setField(term33686, term33686.getClass(), "name", "HDaezxQfQR");
        setField(term33686, term33686.getClass(), "year", "iikZEapDlu");
        setField(term33686, term33686.getClass(), "semester", "nhoHrZfnIN");
        setField(term33686, term33686.getClass(), "lecturer", "ZkMALXpEAZ");
        setBooleanField(term33686, term33686.getClass(), "isLecturerEditable", false);
        setField(term33686, term33686.getClass(), "campus", "tXfQjSqDzN");
        setField(term33686, term33686.getClass(), "room", "BjugTaMcxJ");
        setField(term33686, term33686.getClass(), "day", "vGiuZVPJNH");
        setField(term33686, term33686.getClass(), "time", "tlzpzIjMib");
        setField(term33686, term33686.getClass(), "requirement", "AZdLeSugwv");
        setIntField(term33686, term33686.getClass(), "creditHours", 1296895584);
        setBooleanField(term33686, term33686.getClass(), "isConfirmed", false);
        setField(term33686, term33686.getClass(), "status", "RMsXuyzKJV");
        Object term33823 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term33823, term33823.getClass(), "score", 0.2779719046761513);
        setField(term33823, term33823.getClass(), "code", "FwPbDZcHmB");
        setField(term33823, term33823.getClass(), "name", "hOncybyCAH");
        setField(term33823, term33823.getClass(), "year", "QduALnDSVo");
        setField(term33823, term33823.getClass(), "semester", "izPpKDErnQ");
        setField(term33823, term33823.getClass(), "lecturer", "NnpwZBUTvx");
        setBooleanField(term33823, term33823.getClass(), "isLecturerEditable", false);
        setField(term33823, term33823.getClass(), "campus", "tlQSNgTkQX");
        setField(term33823, term33823.getClass(), "room", "PCipZnmBOF");
        setField(term33823, term33823.getClass(), "day", "zcorEihhLK");
        setField(term33823, term33823.getClass(), "time", "GrqozDKFOk");
        setField(term33823, term33823.getClass(), "requirement", "CFyoseFGLF");
        setIntField(term33823, term33823.getClass(), "creditHours", 628918458);
        setBooleanField(term33823, term33823.getClass(), "isConfirmed", false);
        setField(term33823, term33823.getClass(), "status", "SFqCrhEWLm");
        Object term33960 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term33960, term33960.getClass(), "score", 0.6436713023569729);
        setField(term33960, term33960.getClass(), "code", "GZdcJyZntS");
        setField(term33960, term33960.getClass(), "name", "OIHoJeysUi");
        setField(term33960, term33960.getClass(), "year", "WXMWFDGcLB");
        setField(term33960, term33960.getClass(), "semester", "wKWbJssZuG");
        setField(term33960, term33960.getClass(), "lecturer", "NzBMMhkhpT");
        setBooleanField(term33960, term33960.getClass(), "isLecturerEditable", false);
        setField(term33960, term33960.getClass(), "campus", "qCpEbQDHdF");
        setField(term33960, term33960.getClass(), "room", "AHbZyFOmlo");
        setField(term33960, term33960.getClass(), "day", "TwfWVQGiIj");
        setField(term33960, term33960.getClass(), "time", "gUvcueTURF");
        setField(term33960, term33960.getClass(), "requirement", "EwQBhZjCIT");
        setIntField(term33960, term33960.getClass(), "creditHours", -1274456137);
        setBooleanField(term33960, term33960.getClass(), "isConfirmed", false);
        setField(term33960, term33960.getClass(), "status", "aSkmSwTnEw");
        Object term34097 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term34097, term34097.getClass(), "score", 0.7332741045694002);
        setField(term34097, term34097.getClass(), "code", "xvkbvaEGYd");
        setField(term34097, term34097.getClass(), "name", "HBGNxdNURv");
        setField(term34097, term34097.getClass(), "year", "mfCpTPPQQm");
        setField(term34097, term34097.getClass(), "semester", "OcJCIDNIXA");
        setField(term34097, term34097.getClass(), "lecturer", "XfRABIFVEp");
        setBooleanField(term34097, term34097.getClass(), "isLecturerEditable", false);
        setField(term34097, term34097.getClass(), "campus", "MHGKyEnwKc");
        setField(term34097, term34097.getClass(), "room", "ShIELyuULw");
        setField(term34097, term34097.getClass(), "day", "IpQuOGMgmj");
        setField(term34097, term34097.getClass(), "time", "pJbnHTYrxn");
        setField(term34097, term34097.getClass(), "requirement", "iIRsCSYqXH");
        setIntField(term34097, term34097.getClass(), "creditHours", 1041916673);
        setBooleanField(term34097, term34097.getClass(), "isConfirmed", false);
        setField(term34097, term34097.getClass(), "status", "nghfqDXyCG");
        Object term34234 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term34234, term34234.getClass(), "score", 0.4569171842750229);
        setField(term34234, term34234.getClass(), "code", "WBAOTqErtm");
        setField(term34234, term34234.getClass(), "name", "PqtVXXZMqK");
        setField(term34234, term34234.getClass(), "year", "rYbtIDVdnd");
        setField(term34234, term34234.getClass(), "semester", "UKAReurpHG");
        setField(term34234, term34234.getClass(), "lecturer", "WVRMUmrljA");
        setBooleanField(term34234, term34234.getClass(), "isLecturerEditable", true);
        setField(term34234, term34234.getClass(), "campus", "NTlKJDDWlk");
        setField(term34234, term34234.getClass(), "room", "vOuMEpOQAg");
        setField(term34234, term34234.getClass(), "day", "SIODFGaQhr");
        setField(term34234, term34234.getClass(), "time", "qYzsiuXOgS");
        setField(term34234, term34234.getClass(), "requirement", "bxrCBbrrct");
        setIntField(term34234, term34234.getClass(), "creditHours", -601863069);
        setBooleanField(term34234, term34234.getClass(), "isConfirmed", false);
        setField(term34234, term34234.getClass(), "status", "CKWpJaaaxX");
        Object term34371 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term34371, term34371.getClass(), "score", 0.8598297828918529);
        setField(term34371, term34371.getClass(), "code", "UBRmXJmfrt");
        setField(term34371, term34371.getClass(), "name", "WZzvmIHhzZ");
        setField(term34371, term34371.getClass(), "year", "doQLHkjpNm");
        setField(term34371, term34371.getClass(), "semester", "lCyLIcSuom");
        setField(term34371, term34371.getClass(), "lecturer", "CGOpQSZZwI");
        setBooleanField(term34371, term34371.getClass(), "isLecturerEditable", false);
        setField(term34371, term34371.getClass(), "campus", "ypEdrstygY");
        setField(term34371, term34371.getClass(), "room", "sNQFlATEeQ");
        setField(term34371, term34371.getClass(), "day", "ZKMLioamsY");
        setField(term34371, term34371.getClass(), "time", "WVbxuoDBcn");
        setField(term34371, term34371.getClass(), "requirement", "pvDEABOxLt");
        setIntField(term34371, term34371.getClass(), "creditHours", 663292551);
        setBooleanField(term34371, term34371.getClass(), "isConfirmed", true);
        setField(term34371, term34371.getClass(), "status", "beAMpkroCQ");
        term33410 = new ArrayList();
        ((ArrayList) term33410).add(term33412);
        ((ArrayList) term33410).add(term33549);
        ((ArrayList) term33410).add(term33686);
        ((ArrayList) term33410).add(term33823);
        ((ArrayList) term33410).add(term33960);
        ((ArrayList) term33410).add(term34097);
        ((ArrayList) term33410).add(term34234);
        ((ArrayList) term33410).add(term34371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.ArrayList");
        argTypes[2] = Class.forName("java.awt.Component");
        Object[] args = new Object[3];
        args[0] = "cudZvLMQon";
        args[1] = term33410;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


