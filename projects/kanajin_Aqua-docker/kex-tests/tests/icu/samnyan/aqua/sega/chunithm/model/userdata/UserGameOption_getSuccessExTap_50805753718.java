package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOption_getSuccessExTap_50805753718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56821;

    public UserGameOption_getSuccessExTap_50805753718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56827 = new Long(-8085190702504231560L);
        term56821 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term56823 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term56825 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56846 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56856 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56878 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56987 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57033 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56821, term56821.getClass(), "id", -7084245215702303910L);
        setLongField(term56823, term56823.getClass(), "id", -2143540634259970953L);
        setLongField(term56825, term56825.getClass(), "id", -6779665610828821838L);
        setField(term56825, term56825.getClass(), "extId", term56827);
        setField(term56825, term56825.getClass(), "luid", "UKQejaeJWY");
        setIntField(term56842, term56842.getClass(), "year", 2018);
        setShortField(term56842, term56842.getClass(), "month", (short) 10);
        setShortField(term56842, term56842.getClass(), "day", (short) 31);
        setField(term56841, term56841.getClass(), "date", term56842);
        setByteField(term56846, term56846.getClass(), "hour", (byte) 9);
        setByteField(term56846, term56846.getClass(), "minute", (byte) 43);
        setByteField(term56846, term56846.getClass(), "second", (byte) 37);
        setIntField(term56846, term56846.getClass(), "nano", 207857677);
        setField(term56841, term56841.getClass(), "time", term56846);
        setField(term56825, term56825.getClass(), "registerTime", term56841);
        setIntField(term56852, term56852.getClass(), "year", 2026);
        setShortField(term56852, term56852.getClass(), "month", (short) 6);
        setShortField(term56852, term56852.getClass(), "day", (short) 21);
        setField(term56851, term56851.getClass(), "date", term56852);
        setByteField(term56856, term56856.getClass(), "hour", (byte) 16);
        setByteField(term56856, term56856.getClass(), "minute", (byte) 57);
        setByteField(term56856, term56856.getClass(), "second", (byte) 9);
        setIntField(term56856, term56856.getClass(), "nano", 14807006);
        setField(term56851, term56851.getClass(), "time", term56856);
        setField(term56825, term56825.getClass(), "accessTime", term56851);
        setField(term56823, term56823.getClass(), "card", term56825);
        setField(term56823, term56823.getClass(), "userName", "lNbVasLAKL");
        setIntField(term56874, term56874.getClass(), "year", 2014);
        setShortField(term56874, term56874.getClass(), "month", (short) 5);
        setShortField(term56874, term56874.getClass(), "day", (short) 26);
        setField(term56873, term56873.getClass(), "date", term56874);
        setByteField(term56878, term56878.getClass(), "hour", (byte) 21);
        setByteField(term56878, term56878.getClass(), "minute", (byte) 54);
        setByteField(term56878, term56878.getClass(), "second", (byte) 33);
        setIntField(term56878, term56878.getClass(), "nano", 182465793);
        setField(term56873, term56873.getClass(), "time", term56878);
        setField(term56823, term56823.getClass(), "lastLoginDate", term56873);
        setBooleanField(term56823, term56823.getClass(), "isWebJoin", true);
        setField(term56823, term56823.getClass(), "webLimitDate", "wKeyHBCSLZ");
        setIntField(term56823, term56823.getClass(), "level", -1911852008);
        setIntField(term56823, term56823.getClass(), "reincarnationNum", -126937505);
        setField(term56823, term56823.getClass(), "exp", "iQCLduwSPi");
        setLongField(term56823, term56823.getClass(), "point", 7026184159827656720L);
        setLongField(term56823, term56823.getClass(), "totalPoint", 432186805820232994L);
        setIntField(term56823, term56823.getClass(), "playCount", 1600311664);
        setIntField(term56823, term56823.getClass(), "multiPlayCount", 1505616296);
        setIntField(term56823, term56823.getClass(), "multiWinCount", 453453842);
        setIntField(term56823, term56823.getClass(), "requestResCount", 591356101);
        setIntField(term56823, term56823.getClass(), "acceptResCount", 1387849981);
        setIntField(term56823, term56823.getClass(), "successResCount", 518095920);
        setIntField(term56823, term56823.getClass(), "playerRating", 1333750018);
        setIntField(term56823, term56823.getClass(), "highestRating", 1824319777);
        setIntField(term56823, term56823.getClass(), "nameplateId", -942865663);
        setIntField(term56823, term56823.getClass(), "frameId", 612230460);
        setIntField(term56823, term56823.getClass(), "characterId", -87837417);
        setIntField(term56823, term56823.getClass(), "trophyId", -1864680068);
        setIntField(term56823, term56823.getClass(), "playedTutorialBit", 1979269463);
        setIntField(term56823, term56823.getClass(), "firstTutorialCancelNum", -1690818607);
        setIntField(term56823, term56823.getClass(), "masterTutorialCancelNum", 252440319);
        setIntField(term56823, term56823.getClass(), "totalRepertoireCount", -1798089143);
        setIntField(term56823, term56823.getClass(), "totalMapNum", -2056399026);
        setLongField(term56823, term56823.getClass(), "totalHiScore", -2991029806121048772L);
        setLongField(term56823, term56823.getClass(), "totalBasicHighScore", -1146200229133968810L);
        setLongField(term56823, term56823.getClass(), "totalAdvancedHighScore", -7968999170526273722L);
        setLongField(term56823, term56823.getClass(), "totalExpertHighScore", -391398551284253915L);
        setLongField(term56823, term56823.getClass(), "totalMasterHighScore", -2791473406557466846L);
        setIntField(term56935, term56935.getClass(), "year", 2019);
        setShortField(term56935, term56935.getClass(), "month", (short) 4);
        setShortField(term56935, term56935.getClass(), "day", (short) 3);
        setField(term56934, term56934.getClass(), "date", term56935);
        setByteField(term56939, term56939.getClass(), "hour", (byte) 11);
        setByteField(term56939, term56939.getClass(), "minute", (byte) 54);
        setByteField(term56939, term56939.getClass(), "second", (byte) 10);
        setIntField(term56939, term56939.getClass(), "nano", 203720801);
        setField(term56934, term56934.getClass(), "time", term56939);
        setField(term56823, term56823.getClass(), "eventWatchedDate", term56934);
        setIntField(term56823, term56823.getClass(), "friendCount", -150070327);
        setBooleanField(term56823, term56823.getClass(), "isMaimai", true);
        setField(term56823, term56823.getClass(), "firstGameId", "ZcODLNhxqg");
        setField(term56823, term56823.getClass(), "firstRomVersion", "iNtHOROBMq");
        setField(term56823, term56823.getClass(), "firstDataVersion", "GbvfbbsrOl");
        setIntField(term56983, term56983.getClass(), "year", 2017);
        setShortField(term56983, term56983.getClass(), "month", (short) 9);
        setShortField(term56983, term56983.getClass(), "day", (short) 20);
        setField(term56982, term56982.getClass(), "date", term56983);
        setByteField(term56987, term56987.getClass(), "hour", (byte) 7);
        setByteField(term56987, term56987.getClass(), "minute", (byte) 35);
        setByteField(term56987, term56987.getClass(), "second", (byte) 31);
        setIntField(term56987, term56987.getClass(), "nano", 62099803);
        setField(term56982, term56982.getClass(), "time", term56987);
        setField(term56823, term56823.getClass(), "firstPlayDate", term56982);
        setField(term56823, term56823.getClass(), "lastGameId", "IIZlqzOmtY");
        setField(term56823, term56823.getClass(), "lastRomVersion", "iRFRSxtnkr");
        setField(term56823, term56823.getClass(), "lastDataVersion", "iGWkLjLGBY");
        setIntField(term57029, term57029.getClass(), "year", 2025);
        setShortField(term57029, term57029.getClass(), "month", (short) 1);
        setShortField(term57029, term57029.getClass(), "day", (short) 8);
        setField(term57028, term57028.getClass(), "date", term57029);
        setByteField(term57033, term57033.getClass(), "hour", (byte) 19);
        setByteField(term57033, term57033.getClass(), "minute", (byte) 44);
        setByteField(term57033, term57033.getClass(), "second", (byte) 29);
        setIntField(term57033, term57033.getClass(), "nano", 541948713);
        setField(term57028, term57028.getClass(), "time", term57033);
        setField(term56823, term56823.getClass(), "lastPlayDate", term57028);
        setIntField(term56823, term56823.getClass(), "lastPlaceId", -731659931);
        setField(term56823, term56823.getClass(), "lastPlaceName", "jUkXaNkoAg");
        setField(term56823, term56823.getClass(), "lastRegionId", "mZsPsRzyhQ");
        setField(term56823, term56823.getClass(), "lastRegionName", "IExlbTemvJ");
        setField(term56823, term56823.getClass(), "lastAllNetId", "zaljyXXCoy");
        setField(term56823, term56823.getClass(), "lastClientId", "dKoYnXLGEI");
        setField(term56821, term56821.getClass(), "user", term56823);
        setIntField(term56821, term56821.getClass(), "bgInfo", 645238162);
        setIntField(term56821, term56821.getClass(), "fieldColor", -987757870);
        setIntField(term56821, term56821.getClass(), "guideSound", 2132585005);
        setIntField(term56821, term56821.getClass(), "soundEffect", 451557051);
        setIntField(term56821, term56821.getClass(), "guideLine", 71783796);
        setIntField(term56821, term56821.getClass(), "speed", 2085417929);
        setIntField(term56821, term56821.getClass(), "optionSet", 644887242);
        setIntField(term56821, term56821.getClass(), "matching", 1544325432);
        setIntField(term56821, term56821.getClass(), "judgePos", 908157389);
        setIntField(term56821, term56821.getClass(), "rating", 691619263);
        setIntField(term56821, term56821.getClass(), "judgeJustice", 637841150);
        setIntField(term56821, term56821.getClass(), "judgeAttack", 1599041316);
        setIntField(term56821, term56821.getClass(), "headphone", 1478113587);
        setIntField(term56821, term56821.getClass(), "playerLevel", 1580986308);
        setIntField(term56821, term56821.getClass(), "successTap", -870011438);
        setIntField(term56821, term56821.getClass(), "successExTap", -1767217325);
        setIntField(term56821, term56821.getClass(), "successSlideHold", -170630873);
        setIntField(term56821, term56821.getClass(), "successAir", -1246900588);
        setIntField(term56821, term56821.getClass(), "successFlick", 548633933);
        setIntField(term56821, term56821.getClass(), "successSkill", -1532179986);
        setIntField(term56821, term56821.getClass(), "successTapTimbre", 1644599689);
        setIntField(term56821, term56821.getClass(), "privacy", 1665477880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessExTap", argTypes, term56821, args);
    }

};


