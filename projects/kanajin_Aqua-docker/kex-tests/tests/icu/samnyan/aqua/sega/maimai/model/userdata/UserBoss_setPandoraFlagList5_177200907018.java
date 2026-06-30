package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserBoss_setPandoraFlagList5_177200907018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94155;
     Object term94339;

    public UserBoss_setPandoraFlagList5_177200907018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94161 = new Long(2022482096970820459L);
        term94155 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term94157 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term94159 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94180 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94190 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94155, term94155.getClass(), "id", -5097855288490086692L);
        setLongField(term94157, term94157.getClass(), "id", -8356953418230835643L);
        setLongField(term94159, term94159.getClass(), "id", -2213998544405629464L);
        setField(term94159, term94159.getClass(), "extId", term94161);
        setField(term94159, term94159.getClass(), "luid", "zoVKwYYMOI");
        setIntField(term94176, term94176.getClass(), "year", 2018);
        setShortField(term94176, term94176.getClass(), "month", (short) 12);
        setShortField(term94176, term94176.getClass(), "day", (short) 31);
        setField(term94175, term94175.getClass(), "date", term94176);
        setByteField(term94180, term94180.getClass(), "hour", (byte) 21);
        setByteField(term94180, term94180.getClass(), "minute", (byte) 20);
        setByteField(term94180, term94180.getClass(), "second", (byte) 32);
        setIntField(term94180, term94180.getClass(), "nano", 236426663);
        setField(term94175, term94175.getClass(), "time", term94180);
        setField(term94159, term94159.getClass(), "registerTime", term94175);
        setIntField(term94186, term94186.getClass(), "year", 2027);
        setShortField(term94186, term94186.getClass(), "month", (short) 10);
        setShortField(term94186, term94186.getClass(), "day", (short) 22);
        setField(term94185, term94185.getClass(), "date", term94186);
        setByteField(term94190, term94190.getClass(), "hour", (byte) 22);
        setByteField(term94190, term94190.getClass(), "minute", (byte) 49);
        setByteField(term94190, term94190.getClass(), "second", (byte) 17);
        setIntField(term94190, term94190.getClass(), "nano", 698349746);
        setField(term94185, term94185.getClass(), "time", term94190);
        setField(term94159, term94159.getClass(), "accessTime", term94185);
        setField(term94157, term94157.getClass(), "card", term94159);
        setIntField(term94157, term94157.getClass(), "lastDataVersion", -1797863095);
        setField(term94157, term94157.getClass(), "userName", "DGCeQsmIOU");
        setIntField(term94157, term94157.getClass(), "point", 857108422);
        setIntField(term94157, term94157.getClass(), "totalPoint", -1089564718);
        setIntField(term94157, term94157.getClass(), "iconId", 1985944979);
        setIntField(term94157, term94157.getClass(), "nameplateId", 600742414);
        setIntField(term94157, term94157.getClass(), "frameId", -848491327);
        setIntField(term94157, term94157.getClass(), "trophyId", 271036746);
        setIntField(term94157, term94157.getClass(), "playCount", 1921972298);
        setIntField(term94157, term94157.getClass(), "playVsCount", 1759412486);
        setIntField(term94157, term94157.getClass(), "playSyncCount", -609040240);
        setIntField(term94157, term94157.getClass(), "winCount", -263119455);
        setIntField(term94157, term94157.getClass(), "helpCount", 1676382020);
        setIntField(term94157, term94157.getClass(), "comboCount", -368458204);
        setIntField(term94157, term94157.getClass(), "feverCount", 385413138);
        setIntField(term94157, term94157.getClass(), "totalHiScore", 546200121);
        setIntField(term94157, term94157.getClass(), "totalEasyHighScore", -100422031);
        setIntField(term94157, term94157.getClass(), "totalBasicHighScore", -906004322);
        setIntField(term94157, term94157.getClass(), "totalAdvancedHighScore", -2047208630);
        setIntField(term94157, term94157.getClass(), "totalExpertHighScore", 1549289354);
        setIntField(term94157, term94157.getClass(), "totalMasterHighScore", -1656094384);
        setIntField(term94157, term94157.getClass(), "totalReMasterHighScore", -1810376733);
        setIntField(term94157, term94157.getClass(), "totalHighSync", 1564142914);
        setIntField(term94157, term94157.getClass(), "totalEasySync", -702106315);
        setIntField(term94157, term94157.getClass(), "totalBasicSync", -350021779);
        setIntField(term94157, term94157.getClass(), "totalAdvancedSync", 1208670155);
        setIntField(term94157, term94157.getClass(), "totalExpertSync", -294164949);
        setIntField(term94157, term94157.getClass(), "totalMasterSync", 1240900440);
        setIntField(term94157, term94157.getClass(), "totalReMasterSync", 1227926827);
        setIntField(term94157, term94157.getClass(), "playerRating", -1056033776);
        setIntField(term94157, term94157.getClass(), "highestRating", 484119496);
        setIntField(term94157, term94157.getClass(), "rankAuthTailId", 1357038884);
        setField(term94157, term94157.getClass(), "eventWatchedDate", "otcpSHwkzG");
        setField(term94157, term94157.getClass(), "webLimitDate", "BixZhUjVme");
        setIntField(term94157, term94157.getClass(), "challengeTrackPhase", 990002371);
        setIntField(term94157, term94157.getClass(), "firstPlayBits", -67320068);
        setField(term94157, term94157.getClass(), "lastPlayDate", "BmnUezUoWz");
        setIntField(term94157, term94157.getClass(), "lastPlaceId", -1718166515);
        setField(term94157, term94157.getClass(), "lastPlaceName", "QqeCgeRpIS");
        setIntField(term94157, term94157.getClass(), "lastRegionId", -1003939669);
        setField(term94157, term94157.getClass(), "lastRegionName", "xVwossmLda");
        setField(term94157, term94157.getClass(), "lastClientId", "EvSQeALexj");
        setField(term94157, term94157.getClass(), "lastCountryCode", "VuprBjhWdI");
        setIntField(term94157, term94157.getClass(), "eventPoint", 1632574348);
        setIntField(term94157, term94157.getClass(), "totalLv", -334489756);
        setIntField(term94157, term94157.getClass(), "lastLoginBonusDay", -1587831293);
        setIntField(term94157, term94157.getClass(), "lastSurvivalBonusDay", 139569150);
        setIntField(term94157, term94157.getClass(), "loginBonusLv", -1587632260);
        setField(term94155, term94155.getClass(), "user", term94157);
        setLongField(term94155, term94155.getClass(), "pandoraFlagList0", 226516165063797489L);
        setLongField(term94155, term94155.getClass(), "pandoraFlagList1", -5055043026089632641L);
        setLongField(term94155, term94155.getClass(), "pandoraFlagList2", -3602145915631274444L);
        setLongField(term94155, term94155.getClass(), "pandoraFlagList3", 1978286377020745883L);
        setLongField(term94155, term94155.getClass(), "pandoraFlagList4", 2957284484642534979L);
        setLongField(term94155, term94155.getClass(), "pandoraFlagList5", -4645802432501468482L);
        setLongField(term94155, term94155.getClass(), "pandoraFlagList6", 797348855178248421L);
        setLongField(term94155, term94155.getClass(), "emblemFlagList", 4140938707845767186L);
        term94339 = new Long(-6049958218605558734L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term94339;
        callMethod(klass, "setPandoraFlagList5", argTypes, term94155, args);
    }

};


