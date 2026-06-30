package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_getLastPlayDate_17714715320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1661;

    public ProfileResp_getLastPlayDate_17714715320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1661 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1708 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1713 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1714 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1718 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1661, term1661.getClass(), "userName", "wSQxaModmm");
        setIntField(term1661, term1661.getClass(), "level", 371943306);
        setField(term1661, term1661.getClass(), "exp", "UlajhuVLaP");
        setLongField(term1661, term1661.getClass(), "point", -7115418542247301000L);
        setLongField(term1661, term1661.getClass(), "totalPoint", 8034714140377562739L);
        setIntField(term1661, term1661.getClass(), "playCount", 982388293);
        setIntField(term1661, term1661.getClass(), "playerRating", -159494544);
        setIntField(term1661, term1661.getClass(), "highestRating", -75206835);
        setIntField(term1661, term1661.getClass(), "nameplateId", -1618206977);
        setIntField(term1661, term1661.getClass(), "frameId", -1747406163);
        setIntField(term1661, term1661.getClass(), "characterId", 388157121);
        setIntField(term1661, term1661.getClass(), "trophyId", 1684998508);
        setIntField(term1661, term1661.getClass(), "totalMapNum", -1476644457);
        setLongField(term1661, term1661.getClass(), "totalHiScore", -2924531382671518368L);
        setLongField(term1661, term1661.getClass(), "totalBasicHighScore", -3948863953565024517L);
        setLongField(term1661, term1661.getClass(), "totalAdvancedHighScore", -6587807377747738663L);
        setLongField(term1661, term1661.getClass(), "totalExpertHighScore", -6301101997917060727L);
        setLongField(term1661, term1661.getClass(), "totalMasterHighScore", 8166095254618543564L);
        setIntField(term1661, term1661.getClass(), "friendCount", 1270666529);
        setIntField(term1704, term1704.getClass(), "year", 2015);
        setShortField(term1704, term1704.getClass(), "month", (short) 12);
        setShortField(term1704, term1704.getClass(), "day", (short) 23);
        setField(term1703, term1703.getClass(), "date", term1704);
        setByteField(term1708, term1708.getClass(), "hour", (byte) 14);
        setByteField(term1708, term1708.getClass(), "minute", (byte) 17);
        setByteField(term1708, term1708.getClass(), "second", (byte) 50);
        setIntField(term1708, term1708.getClass(), "nano", 325544804);
        setField(term1703, term1703.getClass(), "time", term1708);
        setField(term1661, term1661.getClass(), "firstPlayDate", term1703);
        setIntField(term1714, term1714.getClass(), "year", 2027);
        setShortField(term1714, term1714.getClass(), "month", (short) 11);
        setShortField(term1714, term1714.getClass(), "day", (short) 8);
        setField(term1713, term1713.getClass(), "date", term1714);
        setByteField(term1718, term1718.getClass(), "hour", (byte) 11);
        setByteField(term1718, term1718.getClass(), "minute", (byte) 59);
        setByteField(term1718, term1718.getClass(), "second", (byte) 14);
        setIntField(term1718, term1718.getClass(), "nano", 322375591);
        setField(term1713, term1713.getClass(), "time", term1718);
        setField(term1661, term1661.getClass(), "lastPlayDate", term1713);
        setIntField(term1661, term1661.getClass(), "courseClass", -1146679443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term1661, args);
    }

};


