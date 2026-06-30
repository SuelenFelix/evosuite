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

public class GetUserPreviewResp_setFrameId_84653399924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5517;
     Object term5558;

    public GetUserPreviewResp_setFrameId_84653399924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5518 = new Long(0L);
        term5517 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp"));
        setField(term5517, term5517.getClass(), "userId", term5518);
        setField(term5517, term5517.getClass(), "userName", "");
        setBooleanField(term5517, term5517.getClass(), "isLogin", false);
        setIntField(term5517, term5517.getClass(), "lastDataVersion", 170509161);
        setField(term5517, term5517.getClass(), "lastLoginDate", "XjDhvToxJy");
        setField(term5517, term5517.getClass(), "lastPlayDate", "nxSTJflLQy");
        setIntField(term5517, term5517.getClass(), "playerRating", 491497994);
        setIntField(term5517, term5517.getClass(), "nameplateId", 1997288643);
        setIntField(term5517, term5517.getClass(), "frameId", -378961519);
        setIntField(term5517, term5517.getClass(), "iconId", -400280008);
        setIntField(term5517, term5517.getClass(), "trophyId", -1191957775);
        setIntField(term5517, term5517.getClass(), "dispRate", 1);
        setIntField(term5517, term5517.getClass(), "dispRank", 1);
        setIntField(term5517, term5517.getClass(), "dispHomeRanker", 1);
        setIntField(term5517, term5517.getClass(), "dispTotalLv", 1);
        setIntField(term5517, term5517.getClass(), "totalLv", 14181775);
        term5558 = new Integer(667778327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5558;
        callMethod(klass, "setFrameId", argTypes, term5517, args);
    }

};


