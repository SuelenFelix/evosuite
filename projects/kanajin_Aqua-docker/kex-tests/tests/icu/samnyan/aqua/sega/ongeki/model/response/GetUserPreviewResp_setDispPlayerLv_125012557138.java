package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GetUserPreviewResp_setDispPlayerLv_125012557138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7986;
     Object term8036;

    public GetUserPreviewResp_setDispPlayerLv_125012557138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7986 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7986, term7986.getClass(), "userId", -6096027338784768449L);
        setBooleanField(term7986, term7986.getClass(), "isLogin", true);
        setField(term7986, term7986.getClass(), "lastLoginDate", "vYMCjgnztg");
        setField(term7986, term7986.getClass(), "userName", "");
        setIntField(term7986, term7986.getClass(), "reincarnationNum", 805027262);
        setIntField(term7986, term7986.getClass(), "level", 717389178);
        setLongField(term7986, term7986.getClass(), "exp", 6338971839666144092L);
        setLongField(term7986, term7986.getClass(), "playerRating", 5295517562699482299L);
        setField(term7986, term7986.getClass(), "lastGameId", "");
        setField(term7986, term7986.getClass(), "lastRomVersion", "");
        setField(term7986, term7986.getClass(), "lastDataVersion", "");
        setField(term7986, term7986.getClass(), "lastPlayDate", "YupgKTSEiI");
        setIntField(term7986, term7986.getClass(), "nameplateId", -1265226052);
        setIntField(term7986, term7986.getClass(), "trophyId", 1970023149);
        setIntField(term7986, term7986.getClass(), "cardId", -336351735);
        setIntField(term7986, term7986.getClass(), "dispPlayerLv", 1938932230);
        setIntField(term7986, term7986.getClass(), "dispRating", 1128720609);
        setIntField(term7986, term7986.getClass(), "dispBP", 216265002);
        setIntField(term7986, term7986.getClass(), "headphone", -97405660);
        setIntField(term7986, term7986.getClass(), "banStatus", 872278468);
        setBooleanField(term7986, term7986.getClass(), "isWarningConfirmed", false);
        setIntField(term7986, term7986.getClass(), "lastEmoneyBrand", -1003390920);
        setIntField(term7986, term7986.getClass(), "lastEmoneyCredit", -2052568448);
        term8036 = new Integer(664155196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8036;
        callMethod(klass, "setDispPlayerLv", argTypes, term7986, args);
    }

};


