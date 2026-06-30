package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserCourse_getTotalAchievement_3291638096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74756;

    public UserCourse_getTotalAchievement_3291638096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74762 = new Long(-7268507582722666254L);
        Integer term74825 = new Integer(-2092117838);
        Integer term74827 = new Integer(1524590776);
        Integer term74829 = new Integer(1523896653);
        ArrayList term74823 = new ArrayList();
        ((ArrayList) term74823).add(term74825);
        ((ArrayList) term74823).add(term74827);
        ((ArrayList) term74823).add(term74829);
        Integer term74835 = new Integer(-1731921726);
        Integer term74837 = new Integer(919994471);
        Integer term74839 = new Integer(183531701);
        Integer term74841 = new Integer(-974923743);
        Integer term74843 = new Integer(1876738932);
        Integer term74845 = new Integer(-1870339027);
        Integer term74847 = new Integer(-1549603566);
        Integer term74849 = new Integer(1077223540);
        ArrayList term74833 = new ArrayList();
        ((ArrayList) term74833).add(term74835);
        ((ArrayList) term74833).add(term74837);
        ((ArrayList) term74833).add(term74839);
        ((ArrayList) term74833).add(term74841);
        ((ArrayList) term74833).add(term74843);
        ((ArrayList) term74833).add(term74845);
        ((ArrayList) term74833).add(term74847);
        ((ArrayList) term74833).add(term74849);
        term74756 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term74758 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term74760 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term74776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74781 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74791 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term74756, term74756.getClass(), "id", 6682873780442022620L);
        setLongField(term74758, term74758.getClass(), "id", -3902939984522157167L);
        setLongField(term74760, term74760.getClass(), "id", 7961135201719676082L);
        setField(term74760, term74760.getClass(), "extId", term74762);
        setField(term74760, term74760.getClass(), "luid", "JvoSiMCDAb");
        setIntField(term74777, term74777.getClass(), "year", 2024);
        setShortField(term74777, term74777.getClass(), "month", (short) 12);
        setShortField(term74777, term74777.getClass(), "day", (short) 11);
        setField(term74776, term74776.getClass(), "date", term74777);
        setByteField(term74781, term74781.getClass(), "hour", (byte) 19);
        setByteField(term74781, term74781.getClass(), "minute", (byte) 38);
        setByteField(term74781, term74781.getClass(), "second", (byte) 23);
        setIntField(term74781, term74781.getClass(), "nano", 207336939);
        setField(term74776, term74776.getClass(), "time", term74781);
        setField(term74760, term74760.getClass(), "registerTime", term74776);
        setIntField(term74787, term74787.getClass(), "year", 2023);
        setShortField(term74787, term74787.getClass(), "month", (short) 3);
        setShortField(term74787, term74787.getClass(), "day", (short) 29);
        setField(term74786, term74786.getClass(), "date", term74787);
        setByteField(term74791, term74791.getClass(), "hour", (byte) 12);
        setByteField(term74791, term74791.getClass(), "minute", (byte) 11);
        setByteField(term74791, term74791.getClass(), "second", (byte) 3);
        setIntField(term74791, term74791.getClass(), "nano", 876063258);
        setField(term74786, term74786.getClass(), "time", term74791);
        setField(term74760, term74760.getClass(), "accessTime", term74786);
        setField(term74758, term74758.getClass(), "card", term74760);
        setField(term74758, term74758.getClass(), "userName", "JANJXHGMsv");
        setIntField(term74758, term74758.getClass(), "isNetMember", 1824978585);
        setIntField(term74758, term74758.getClass(), "iconId", 2056999648);
        setIntField(term74758, term74758.getClass(), "plateId", -1235710002);
        setIntField(term74758, term74758.getClass(), "titleId", -1092087194);
        setIntField(term74758, term74758.getClass(), "partnerId", 287049516);
        setIntField(term74758, term74758.getClass(), "frameId", -2118245549);
        setIntField(term74758, term74758.getClass(), "selectMapId", -974734669);
        setIntField(term74758, term74758.getClass(), "totalAwake", 637485378);
        setIntField(term74758, term74758.getClass(), "gradeRating", -972072842);
        setIntField(term74758, term74758.getClass(), "musicRating", -1654330782);
        setIntField(term74758, term74758.getClass(), "playerRating", 618840851);
        setIntField(term74758, term74758.getClass(), "highestRating", 879137590);
        setIntField(term74758, term74758.getClass(), "gradeRank", 388908072);
        setIntField(term74758, term74758.getClass(), "classRank", -605646727);
        setIntField(term74758, term74758.getClass(), "courseRank", -1938624293);
        setField(term74758, term74758.getClass(), "charaSlot", term74823);
        setField(term74758, term74758.getClass(), "charaLockSlot", term74833);
        setLongField(term74758, term74758.getClass(), "contentBit", -1611050402158000680L);
        setIntField(term74758, term74758.getClass(), "playCount", 1289551510);
        setField(term74758, term74758.getClass(), "eventWatchedDate", "WVQqsFGJMw");
        setField(term74758, term74758.getClass(), "lastGameId", "TIPSlmidwP");
        setField(term74758, term74758.getClass(), "lastRomVersion", "SRYeqWJJkR");
        setField(term74758, term74758.getClass(), "lastDataVersion", "vUVScKcyFY");
        setField(term74758, term74758.getClass(), "lastLoginDate", "DCSMbuGiaM");
        setField(term74758, term74758.getClass(), "lastPlayDate", "wtOVzMPrFU");
        setIntField(term74758, term74758.getClass(), "lastPlayCredit", 1397954481);
        setIntField(term74758, term74758.getClass(), "lastPlayMode", -394854340);
        setIntField(term74758, term74758.getClass(), "lastPlaceId", -519383992);
        setField(term74758, term74758.getClass(), "lastPlaceName", "CBnamgJrJS");
        setIntField(term74758, term74758.getClass(), "lastAllNetId", -1783256546);
        setIntField(term74758, term74758.getClass(), "lastRegionId", -19542865);
        setField(term74758, term74758.getClass(), "lastRegionName", "uJhRRqAnDP");
        setField(term74758, term74758.getClass(), "lastClientId", "hJCqADrhuV");
        setField(term74758, term74758.getClass(), "lastCountryCode", "RyPUBlRpNZ");
        setIntField(term74758, term74758.getClass(), "lastSelectEMoney", 311289836);
        setIntField(term74758, term74758.getClass(), "lastSelectTicket", -1424263819);
        setIntField(term74758, term74758.getClass(), "lastSelectCourse", -620026126);
        setIntField(term74758, term74758.getClass(), "lastCountCourse", 489378978);
        setField(term74758, term74758.getClass(), "firstGameId", "ardfVpCueq");
        setField(term74758, term74758.getClass(), "firstRomVersion", "wEYAmGJIEF");
        setField(term74758, term74758.getClass(), "firstDataVersion", "iXEhfXJomO");
        setField(term74758, term74758.getClass(), "firstPlayDate", "KEoUMzNdMA");
        setField(term74758, term74758.getClass(), "compatibleCmVersion", "SOsGYAgpgW");
        setField(term74758, term74758.getClass(), "dailyBonusDate", "ZBafuLDRDM");
        setField(term74758, term74758.getClass(), "dailyCourseBonusDate", "VDnsNuhEvG");
        setField(term74758, term74758.getClass(), "lastPairLoginDate", "DMrfMwXyYT");
        setField(term74758, term74758.getClass(), "lastTrialPlayDate", "GAzZvzjuXP");
        setIntField(term74758, term74758.getClass(), "playVsCount", -1498567410);
        setIntField(term74758, term74758.getClass(), "playSyncCount", 1977510197);
        setIntField(term74758, term74758.getClass(), "winCount", 1801307871);
        setIntField(term74758, term74758.getClass(), "helpCount", -528389150);
        setIntField(term74758, term74758.getClass(), "comboCount", -1003260338);
        setLongField(term74758, term74758.getClass(), "totalDeluxscore", 8861575654665150501L);
        setLongField(term74758, term74758.getClass(), "totalBasicDeluxscore", 293702982753277786L);
        setLongField(term74758, term74758.getClass(), "totalAdvancedDeluxscore", 7809414208372445190L);
        setLongField(term74758, term74758.getClass(), "totalExpertDeluxscore", 3056037435259866024L);
        setLongField(term74758, term74758.getClass(), "totalMasterDeluxscore", 1372923762481191417L);
        setLongField(term74758, term74758.getClass(), "totalReMasterDeluxscore", 4307370135092659893L);
        setIntField(term74758, term74758.getClass(), "totalSync", -1745035486);
        setIntField(term74758, term74758.getClass(), "totalBasicSync", -271936794);
        setIntField(term74758, term74758.getClass(), "totalAdvancedSync", -732944429);
        setIntField(term74758, term74758.getClass(), "totalExpertSync", 1929605024);
        setIntField(term74758, term74758.getClass(), "totalMasterSync", 1011940597);
        setIntField(term74758, term74758.getClass(), "totalReMasterSync", -404969989);
        setLongField(term74758, term74758.getClass(), "totalAchievement", -9046114186297002593L);
        setLongField(term74758, term74758.getClass(), "totalBasicAchievement", -398055953150289256L);
        setLongField(term74758, term74758.getClass(), "totalAdvancedAchievement", -1356391415982968329L);
        setLongField(term74758, term74758.getClass(), "totalExpertAchievement", -51437660553060977L);
        setLongField(term74758, term74758.getClass(), "totalMasterAchievement", -2636567666096347903L);
        setLongField(term74758, term74758.getClass(), "totalReMasterAchievement", -7772427422426260409L);
        setLongField(term74758, term74758.getClass(), "playerOldRating", -274606845369208412L);
        setLongField(term74758, term74758.getClass(), "playerNewRating", -7965696185792680870L);
        setIntField(term74758, term74758.getClass(), "banState", 1371124822);
        setLongField(term74758, term74758.getClass(), "dateTime", 5089306796798248912L);
        setField(term74756, term74756.getClass(), "user", term74758);
        setIntField(term74756, term74756.getClass(), "courseId", 1936895143);
        setBooleanField(term74756, term74756.getClass(), "isLastClear", false);
        setIntField(term74756, term74756.getClass(), "totalRestlife", 1980832536);
        setIntField(term74756, term74756.getClass(), "totalAchievement", 1221783561);
        setIntField(term74756, term74756.getClass(), "totalDeluxscore", 1025766530);
        setIntField(term74756, term74756.getClass(), "playCount", 1023561050);
        setField(term74756, term74756.getClass(), "clearDate", "WoFrMqAUlT");
        setField(term74756, term74756.getClass(), "lastPlayDate", "RtHOddPkOW");
        setIntField(term74756, term74756.getClass(), "bestAchievement", -661014919);
        setField(term74756, term74756.getClass(), "bestAchievementDate", "LAaHVAeRPU");
        setIntField(term74756, term74756.getClass(), "bestDeluxscore", 1431348538);
        setField(term74756, term74756.getClass(), "bestDeluxscoreDate", "BLPwYfxwnm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAchievement", argTypes, term74756, args);
    }

};


