package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class ProfileResp_setTotalUltimaHighScore_188426042952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120639;
     Object term120714;

    public ProfileResp_setTotalUltimaHighScore_188426042952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120639 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120687 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120697 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120639, term120639.getClass(), "userName", "RTrlkZrszR");
        setIntField(term120639, term120639.getClass(), "level", 341844013);
        setField(term120639, term120639.getClass(), "exp", "LwEVtHWUbm");
        setLongField(term120639, term120639.getClass(), "point", -1373289583745846808L);
        setLongField(term120639, term120639.getClass(), "totalPoint", -242380797470678711L);
        setIntField(term120639, term120639.getClass(), "playCount", 1480479334);
        setIntField(term120639, term120639.getClass(), "playerRating", 55904328);
        setIntField(term120639, term120639.getClass(), "highestRating", 1428651711);
        setIntField(term120639, term120639.getClass(), "nameplateId", -745369454);
        setIntField(term120639, term120639.getClass(), "frameId", 1226005311);
        setIntField(term120639, term120639.getClass(), "characterId", -254185039);
        setIntField(term120639, term120639.getClass(), "trophyId", -850191652);
        setIntField(term120639, term120639.getClass(), "totalMapNum", -1108942631);
        setLongField(term120639, term120639.getClass(), "totalHiScore", -5130681366312086929L);
        setLongField(term120639, term120639.getClass(), "totalBasicHighScore", -5815010963403726423L);
        setLongField(term120639, term120639.getClass(), "totalAdvancedHighScore", -4344355325060611900L);
        setLongField(term120639, term120639.getClass(), "totalExpertHighScore", -2783285373103915891L);
        setLongField(term120639, term120639.getClass(), "totalMasterHighScore", 5464988889380818357L);
        setLongField(term120639, term120639.getClass(), "totalUltimaHighScore", -8081186299043869903L);
        setIntField(term120639, term120639.getClass(), "friendCount", -852855870);
        setIntField(term120683, term120683.getClass(), "year", 2014);
        setShortField(term120683, term120683.getClass(), "month", (short) 3);
        setShortField(term120683, term120683.getClass(), "day", (short) 31);
        setField(term120682, term120682.getClass(), "date", term120683);
        setByteField(term120687, term120687.getClass(), "hour", (byte) 5);
        setByteField(term120687, term120687.getClass(), "minute", (byte) 3);
        setByteField(term120687, term120687.getClass(), "second", (byte) 26);
        setIntField(term120687, term120687.getClass(), "nano", 25564096);
        setField(term120682, term120682.getClass(), "time", term120687);
        setField(term120639, term120639.getClass(), "firstPlayDate", term120682);
        setIntField(term120693, term120693.getClass(), "year", 2017);
        setShortField(term120693, term120693.getClass(), "month", (short) 7);
        setShortField(term120693, term120693.getClass(), "day", (short) 4);
        setField(term120692, term120692.getClass(), "date", term120693);
        setByteField(term120697, term120697.getClass(), "hour", (byte) 12);
        setByteField(term120697, term120697.getClass(), "minute", (byte) 10);
        setByteField(term120697, term120697.getClass(), "second", (byte) 48);
        setIntField(term120697, term120697.getClass(), "nano", 427456331);
        setField(term120692, term120692.getClass(), "time", term120697);
        setField(term120639, term120639.getClass(), "lastPlayDate", term120692);
        setIntField(term120639, term120639.getClass(), "courseClass", 1865818323);
        setIntField(term120639, term120639.getClass(), "overPowerPoint", -1071086036);
        setIntField(term120639, term120639.getClass(), "overPowerRate", 2083217200);
        setIntField(term120639, term120639.getClass(), "mapIconId", 1301218995);
        setIntField(term120639, term120639.getClass(), "voiceId", 1103652941);
        setIntField(term120639, term120639.getClass(), "avatarWear", 622175637);
        setIntField(term120639, term120639.getClass(), "avatarHead", -609312497);
        setIntField(term120639, term120639.getClass(), "avatarFace", 398744523);
        setIntField(term120639, term120639.getClass(), "avatarSkin", -2132028541);
        setIntField(term120639, term120639.getClass(), "avatarItem", 218867682);
        setIntField(term120639, term120639.getClass(), "avatarFront", 596919233);
        setIntField(term120639, term120639.getClass(), "avatarBack", -914216977);
        term120714 = new Long(5268809567055520901L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term120714;
        callMethod(klass, "setTotalUltimaHighScore", argTypes, term120639, args);
    }

};


