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
import java.lang.Integer;

public class ProfileResp_setAvatarItem_213511429165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121916;
     Object term121991;

    public ProfileResp_setAvatarItem_213511429165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121916 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121960 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121964 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121969 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121970 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121974 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121916, term121916.getClass(), "userName", "GPXGjAdtoJ");
        setIntField(term121916, term121916.getClass(), "level", -443135655);
        setField(term121916, term121916.getClass(), "exp", "rpotsMWMJb");
        setLongField(term121916, term121916.getClass(), "point", -5880536871644887019L);
        setLongField(term121916, term121916.getClass(), "totalPoint", 7984907992991522874L);
        setIntField(term121916, term121916.getClass(), "playCount", 1288495075);
        setIntField(term121916, term121916.getClass(), "playerRating", -1794142250);
        setIntField(term121916, term121916.getClass(), "highestRating", -1183988490);
        setIntField(term121916, term121916.getClass(), "nameplateId", 881029286);
        setIntField(term121916, term121916.getClass(), "frameId", 1400284305);
        setIntField(term121916, term121916.getClass(), "characterId", -763003139);
        setIntField(term121916, term121916.getClass(), "trophyId", -664047809);
        setIntField(term121916, term121916.getClass(), "totalMapNum", -1841430088);
        setLongField(term121916, term121916.getClass(), "totalHiScore", 9033564673534072783L);
        setLongField(term121916, term121916.getClass(), "totalBasicHighScore", -551639182102677710L);
        setLongField(term121916, term121916.getClass(), "totalAdvancedHighScore", 7220537567889807156L);
        setLongField(term121916, term121916.getClass(), "totalExpertHighScore", 6406723091716352058L);
        setLongField(term121916, term121916.getClass(), "totalMasterHighScore", 2769255640086837293L);
        setLongField(term121916, term121916.getClass(), "totalUltimaHighScore", 6021882431858851722L);
        setIntField(term121916, term121916.getClass(), "friendCount", 1983215552);
        setIntField(term121960, term121960.getClass(), "year", 2021);
        setShortField(term121960, term121960.getClass(), "month", (short) 9);
        setShortField(term121960, term121960.getClass(), "day", (short) 23);
        setField(term121959, term121959.getClass(), "date", term121960);
        setByteField(term121964, term121964.getClass(), "hour", (byte) 2);
        setByteField(term121964, term121964.getClass(), "minute", (byte) 49);
        setByteField(term121964, term121964.getClass(), "second", (byte) 45);
        setIntField(term121964, term121964.getClass(), "nano", 224827979);
        setField(term121959, term121959.getClass(), "time", term121964);
        setField(term121916, term121916.getClass(), "firstPlayDate", term121959);
        setIntField(term121970, term121970.getClass(), "year", 2023);
        setShortField(term121970, term121970.getClass(), "month", (short) 10);
        setShortField(term121970, term121970.getClass(), "day", (short) 20);
        setField(term121969, term121969.getClass(), "date", term121970);
        setByteField(term121974, term121974.getClass(), "hour", (byte) 0);
        setByteField(term121974, term121974.getClass(), "minute", (byte) 30);
        setByteField(term121974, term121974.getClass(), "second", (byte) 46);
        setIntField(term121974, term121974.getClass(), "nano", 170504790);
        setField(term121969, term121969.getClass(), "time", term121974);
        setField(term121916, term121916.getClass(), "lastPlayDate", term121969);
        setIntField(term121916, term121916.getClass(), "courseClass", -1684465205);
        setIntField(term121916, term121916.getClass(), "overPowerPoint", 160222576);
        setIntField(term121916, term121916.getClass(), "overPowerRate", -205927046);
        setIntField(term121916, term121916.getClass(), "mapIconId", 2015532623);
        setIntField(term121916, term121916.getClass(), "voiceId", 1603650560);
        setIntField(term121916, term121916.getClass(), "avatarWear", -1831858404);
        setIntField(term121916, term121916.getClass(), "avatarHead", -1501181555);
        setIntField(term121916, term121916.getClass(), "avatarFace", -1626681508);
        setIntField(term121916, term121916.getClass(), "avatarSkin", 1970272715);
        setIntField(term121916, term121916.getClass(), "avatarItem", -1438066615);
        setIntField(term121916, term121916.getClass(), "avatarFront", 1171799879);
        setIntField(term121916, term121916.getClass(), "avatarBack", -880008966);
        term121991 = new Integer(-1994735506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121991;
        callMethod(klass, "setAvatarItem", argTypes, term121916, args);
    }

};


