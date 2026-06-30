package icu.samnyan.aqua.sega.maimai.model.response;

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
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class GetUserPreviewResp_setNameplateId_115399541123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5454;
     Object term5495;

    public GetUserPreviewResp_setNameplateId_115399541123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5455 = new Long(0L);
        term5454 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5454, term5454.getClass(), "userId", term5455);
        setField(term5454, term5454.getClass(), "userName", "");
        setBooleanField(term5454, term5454.getClass(), "isLogin", true);
        setIntField(term5454, term5454.getClass(), "lastDataVersion", 158801111);
        setField(term5454, term5454.getClass(), "lastLoginDate", "NxgmYPzWCI");
        setField(term5454, term5454.getClass(), "lastPlayDate", "SqjyKmayBx");
        setIntField(term5454, term5454.getClass(), "playerRating", 464966803);
        setIntField(term5454, term5454.getClass(), "nameplateId", -246618392);
        setIntField(term5454, term5454.getClass(), "frameId", 1472246167);
        setIntField(term5454, term5454.getClass(), "iconId", 1008555478);
        setIntField(term5454, term5454.getClass(), "trophyId", 1346386442);
        setIntField(term5454, term5454.getClass(), "dispRate", 1);
        setIntField(term5454, term5454.getClass(), "dispRank", 1);
        setIntField(term5454, term5454.getClass(), "dispHomeRanker", 1);
        setIntField(term5454, term5454.getClass(), "dispTotalLv", 1);
        setIntField(term5454, term5454.getClass(), "totalLv", 1904559758);
        term5495 = new Integer(610850630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5495;
        callMethod(klass, "setNameplateId", argTypes, term5454, args);
    }

};


