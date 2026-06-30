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
import java.lang.Integer;

public class UserGameOption_setJudgeJustice_57993078637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65819;
     Object term66119;

    public UserGameOption_setJudgeJustice_57993078637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65825 = new Long(-4822736661741380518L);
        term65819 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term65821 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term65823 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term65839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65844 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65854 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65985 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66031 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term65819, term65819.getClass(), "id", 9132190239280924497L);
        setLongField(term65821, term65821.getClass(), "id", -8116658799088527026L);
        setLongField(term65823, term65823.getClass(), "id", 8485617704048210611L);
        setField(term65823, term65823.getClass(), "extId", term65825);
        setField(term65823, term65823.getClass(), "luid", "DRdgywxCcP");
        setIntField(term65840, term65840.getClass(), "year", 2014);
        setShortField(term65840, term65840.getClass(), "month", (short) 6);
        setShortField(term65840, term65840.getClass(), "day", (short) 12);
        setField(term65839, term65839.getClass(), "date", term65840);
        setByteField(term65844, term65844.getClass(), "hour", (byte) 2);
        setByteField(term65844, term65844.getClass(), "minute", (byte) 24);
        setByteField(term65844, term65844.getClass(), "second", (byte) 28);
        setIntField(term65844, term65844.getClass(), "nano", 77504831);
        setField(term65839, term65839.getClass(), "time", term65844);
        setField(term65823, term65823.getClass(), "registerTime", term65839);
        setIntField(term65850, term65850.getClass(), "year", 2028);
        setShortField(term65850, term65850.getClass(), "month", (short) 11);
        setShortField(term65850, term65850.getClass(), "day", (short) 18);
        setField(term65849, term65849.getClass(), "date", term65850);
        setByteField(term65854, term65854.getClass(), "hour", (byte) 18);
        setByteField(term65854, term65854.getClass(), "minute", (byte) 21);
        setByteField(term65854, term65854.getClass(), "second", (byte) 32);
        setIntField(term65854, term65854.getClass(), "nano", 483463169);
        setField(term65849, term65849.getClass(), "time", term65854);
        setField(term65823, term65823.getClass(), "accessTime", term65849);
        setField(term65821, term65821.getClass(), "card", term65823);
        setField(term65821, term65821.getClass(), "userName", "uelmUHzwnS");
        setIntField(term65872, term65872.getClass(), "year", 2029);
        setShortField(term65872, term65872.getClass(), "month", (short) 11);
        setShortField(term65872, term65872.getClass(), "day", (short) 6);
        setField(term65871, term65871.getClass(), "date", term65872);
        setByteField(term65876, term65876.getClass(), "hour", (byte) 10);
        setByteField(term65876, term65876.getClass(), "minute", (byte) 49);
        setByteField(term65876, term65876.getClass(), "second", (byte) 58);
        setIntField(term65876, term65876.getClass(), "nano", 611097210);
        setField(term65871, term65871.getClass(), "time", term65876);
        setField(term65821, term65821.getClass(), "lastLoginDate", term65871);
        setBooleanField(term65821, term65821.getClass(), "isWebJoin", true);
        setField(term65821, term65821.getClass(), "webLimitDate", "iKuSKqVzvy");
        setIntField(term65821, term65821.getClass(), "level", 329934484);
        setIntField(term65821, term65821.getClass(), "reincarnationNum", 575431591);
        setField(term65821, term65821.getClass(), "exp", "SgyGAlytLF");
        setLongField(term65821, term65821.getClass(), "point", -2343035648899467663L);
        setLongField(term65821, term65821.getClass(), "totalPoint", -1155047331993508760L);
        setIntField(term65821, term65821.getClass(), "playCount", 912666310);
        setIntField(term65821, term65821.getClass(), "multiPlayCount", 302408238);
        setIntField(term65821, term65821.getClass(), "multiWinCount", -685735773);
        setIntField(term65821, term65821.getClass(), "requestResCount", -1229964213);
        setIntField(term65821, term65821.getClass(), "acceptResCount", -206580016);
        setIntField(term65821, term65821.getClass(), "successResCount", -982047423);
        setIntField(term65821, term65821.getClass(), "playerRating", -1580085541);
        setIntField(term65821, term65821.getClass(), "highestRating", -1151473049);
        setIntField(term65821, term65821.getClass(), "nameplateId", 1472205129);
        setIntField(term65821, term65821.getClass(), "frameId", -289676027);
        setIntField(term65821, term65821.getClass(), "characterId", 1248845256);
        setIntField(term65821, term65821.getClass(), "trophyId", 229418911);
        setIntField(term65821, term65821.getClass(), "playedTutorialBit", -1130854864);
        setIntField(term65821, term65821.getClass(), "firstTutorialCancelNum", 1114579008);
        setIntField(term65821, term65821.getClass(), "masterTutorialCancelNum", 1460012868);
        setIntField(term65821, term65821.getClass(), "totalRepertoireCount", -2073192308);
        setIntField(term65821, term65821.getClass(), "totalMapNum", -2085811126);
        setLongField(term65821, term65821.getClass(), "totalHiScore", 3144720397872891648L);
        setLongField(term65821, term65821.getClass(), "totalBasicHighScore", -2622219131724744003L);
        setLongField(term65821, term65821.getClass(), "totalAdvancedHighScore", 9130132268364804177L);
        setLongField(term65821, term65821.getClass(), "totalExpertHighScore", 7597058252879142457L);
        setLongField(term65821, term65821.getClass(), "totalMasterHighScore", -2916052431291931409L);
        setIntField(term65933, term65933.getClass(), "year", 2024);
        setShortField(term65933, term65933.getClass(), "month", (short) 1);
        setShortField(term65933, term65933.getClass(), "day", (short) 6);
        setField(term65932, term65932.getClass(), "date", term65933);
        setByteField(term65937, term65937.getClass(), "hour", (byte) 6);
        setByteField(term65937, term65937.getClass(), "minute", (byte) 55);
        setByteField(term65937, term65937.getClass(), "second", (byte) 13);
        setIntField(term65937, term65937.getClass(), "nano", 533001418);
        setField(term65932, term65932.getClass(), "time", term65937);
        setField(term65821, term65821.getClass(), "eventWatchedDate", term65932);
        setIntField(term65821, term65821.getClass(), "friendCount", -2129502819);
        setBooleanField(term65821, term65821.getClass(), "isMaimai", true);
        setField(term65821, term65821.getClass(), "firstGameId", "OoXopVvpwr");
        setField(term65821, term65821.getClass(), "firstRomVersion", "lwwreKJCFL");
        setField(term65821, term65821.getClass(), "firstDataVersion", "PWBggYjpOQ");
        setIntField(term65981, term65981.getClass(), "year", 2029);
        setShortField(term65981, term65981.getClass(), "month", (short) 8);
        setShortField(term65981, term65981.getClass(), "day", (short) 22);
        setField(term65980, term65980.getClass(), "date", term65981);
        setByteField(term65985, term65985.getClass(), "hour", (byte) 10);
        setByteField(term65985, term65985.getClass(), "minute", (byte) 22);
        setByteField(term65985, term65985.getClass(), "second", (byte) 10);
        setIntField(term65985, term65985.getClass(), "nano", 996890551);
        setField(term65980, term65980.getClass(), "time", term65985);
        setField(term65821, term65821.getClass(), "firstPlayDate", term65980);
        setField(term65821, term65821.getClass(), "lastGameId", "FDzNpfjYDI");
        setField(term65821, term65821.getClass(), "lastRomVersion", "vSbbcByIuA");
        setField(term65821, term65821.getClass(), "lastDataVersion", "QSvdWzkkPx");
        setIntField(term66027, term66027.getClass(), "year", 2021);
        setShortField(term66027, term66027.getClass(), "month", (short) 7);
        setShortField(term66027, term66027.getClass(), "day", (short) 26);
        setField(term66026, term66026.getClass(), "date", term66027);
        setByteField(term66031, term66031.getClass(), "hour", (byte) 16);
        setByteField(term66031, term66031.getClass(), "minute", (byte) 31);
        setByteField(term66031, term66031.getClass(), "second", (byte) 41);
        setIntField(term66031, term66031.getClass(), "nano", 114150112);
        setField(term66026, term66026.getClass(), "time", term66031);
        setField(term65821, term65821.getClass(), "lastPlayDate", term66026);
        setIntField(term65821, term65821.getClass(), "lastPlaceId", -1063218440);
        setField(term65821, term65821.getClass(), "lastPlaceName", "vStdEtWvae");
        setField(term65821, term65821.getClass(), "lastRegionId", "iApJWgnQkP");
        setField(term65821, term65821.getClass(), "lastRegionName", "kHKzzYJxiP");
        setField(term65821, term65821.getClass(), "lastAllNetId", "INFnBrMIka");
        setField(term65821, term65821.getClass(), "lastClientId", "EwmpEgdvZs");
        setField(term65819, term65819.getClass(), "user", term65821);
        setIntField(term65819, term65819.getClass(), "bgInfo", -688177933);
        setIntField(term65819, term65819.getClass(), "fieldColor", -566941881);
        setIntField(term65819, term65819.getClass(), "guideSound", 2051356935);
        setIntField(term65819, term65819.getClass(), "soundEffect", -383329501);
        setIntField(term65819, term65819.getClass(), "guideLine", 617819961);
        setIntField(term65819, term65819.getClass(), "speed", -1030437854);
        setIntField(term65819, term65819.getClass(), "optionSet", 131035705);
        setIntField(term65819, term65819.getClass(), "matching", 1345091994);
        setIntField(term65819, term65819.getClass(), "judgePos", -657987818);
        setIntField(term65819, term65819.getClass(), "rating", -211167283);
        setIntField(term65819, term65819.getClass(), "judgeJustice", -1037774699);
        setIntField(term65819, term65819.getClass(), "judgeAttack", -851853041);
        setIntField(term65819, term65819.getClass(), "headphone", 1501524873);
        setIntField(term65819, term65819.getClass(), "playerLevel", 92455948);
        setIntField(term65819, term65819.getClass(), "successTap", -1557991371);
        setIntField(term65819, term65819.getClass(), "successExTap", -951318891);
        setIntField(term65819, term65819.getClass(), "successSlideHold", 718233611);
        setIntField(term65819, term65819.getClass(), "successAir", -2015648096);
        setIntField(term65819, term65819.getClass(), "successFlick", -818525120);
        setIntField(term65819, term65819.getClass(), "successSkill", 2119335779);
        setIntField(term65819, term65819.getClass(), "successTapTimbre", -808109817);
        setIntField(term65819, term65819.getClass(), "privacy", 33486504);
        term66119 = new Integer(-2112546178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66119;
        callMethod(klass, "setJudgeJustice", argTypes, term65819, args);
    }

};


