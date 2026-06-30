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

public class UserDetail_setLastPlaceId_2115681192107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4290430;
     Object term4290789;

    public UserDetail_setLastPlaceId_2115681192107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4290434 = new Long(7050041705355474598L);
        Integer term4290497 = new Integer(-386655726);
        Integer term4290499 = new Integer(-1507263372);
        Integer term4290501 = new Integer(1422961512);
        Integer term4290503 = new Integer(1716206989);
        Integer term4290505 = new Integer(-1686050149);
        ArrayList term4290495 = new ArrayList();
        ((ArrayList) term4290495).add(term4290497);
        ((ArrayList) term4290495).add(term4290499);
        ((ArrayList) term4290495).add(term4290501);
        ((ArrayList) term4290495).add(term4290503);
        ((ArrayList) term4290495).add(term4290505);
        Integer term4290511 = new Integer(801148897);
        Integer term4290513 = new Integer(-1859757820);
        Integer term4290515 = new Integer(-1791319968);
        Integer term4290517 = new Integer(80849890);
        Integer term4290519 = new Integer(-554684079);
        ArrayList term4290509 = new ArrayList();
        ((ArrayList) term4290509).add(term4290511);
        ((ArrayList) term4290509).add(term4290513);
        ((ArrayList) term4290509).add(term4290515);
        ((ArrayList) term4290509).add(term4290517);
        ((ArrayList) term4290509).add(term4290519);
        term4290430 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4290432 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4290448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4290449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4290453 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4290458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4290459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4290463 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4290430, term4290430.getClass(), "id", -2915769861896084593L);
        setLongField(term4290432, term4290432.getClass(), "id", 5211708757302989078L);
        setField(term4290432, term4290432.getClass(), "extId", term4290434);
        setField(term4290432, term4290432.getClass(), "luid", "WqQeIRUQvd");
        setIntField(term4290449, term4290449.getClass(), "year", 2017);
        setShortField(term4290449, term4290449.getClass(), "month", (short) 9);
        setShortField(term4290449, term4290449.getClass(), "day", (short) 16);
        setField(term4290448, term4290448.getClass(), "date", term4290449);
        setByteField(term4290453, term4290453.getClass(), "hour", (byte) 2);
        setByteField(term4290453, term4290453.getClass(), "minute", (byte) 11);
        setByteField(term4290453, term4290453.getClass(), "second", (byte) 21);
        setIntField(term4290453, term4290453.getClass(), "nano", 71169591);
        setField(term4290448, term4290448.getClass(), "time", term4290453);
        setField(term4290432, term4290432.getClass(), "registerTime", term4290448);
        setIntField(term4290459, term4290459.getClass(), "year", 2019);
        setShortField(term4290459, term4290459.getClass(), "month", (short) 6);
        setShortField(term4290459, term4290459.getClass(), "day", (short) 7);
        setField(term4290458, term4290458.getClass(), "date", term4290459);
        setByteField(term4290463, term4290463.getClass(), "hour", (byte) 15);
        setByteField(term4290463, term4290463.getClass(), "minute", (byte) 24);
        setByteField(term4290463, term4290463.getClass(), "second", (byte) 14);
        setIntField(term4290463, term4290463.getClass(), "nano", 143511954);
        setField(term4290458, term4290458.getClass(), "time", term4290463);
        setField(term4290432, term4290432.getClass(), "accessTime", term4290458);
        setField(term4290430, term4290430.getClass(), "card", term4290432);
        setField(term4290430, term4290430.getClass(), "userName", "oIymdOLmlC");
        setIntField(term4290430, term4290430.getClass(), "isNetMember", -974945680);
        setIntField(term4290430, term4290430.getClass(), "iconId", -909496379);
        setIntField(term4290430, term4290430.getClass(), "plateId", 283604204);
        setIntField(term4290430, term4290430.getClass(), "titleId", -75717727);
        setIntField(term4290430, term4290430.getClass(), "partnerId", -359615005);
        setIntField(term4290430, term4290430.getClass(), "frameId", -1069648784);
        setIntField(term4290430, term4290430.getClass(), "selectMapId", -1175264749);
        setIntField(term4290430, term4290430.getClass(), "totalAwake", 217725219);
        setIntField(term4290430, term4290430.getClass(), "gradeRating", -529179145);
        setIntField(term4290430, term4290430.getClass(), "musicRating", -37470773);
        setIntField(term4290430, term4290430.getClass(), "playerRating", 422669568);
        setIntField(term4290430, term4290430.getClass(), "highestRating", 831568260);
        setIntField(term4290430, term4290430.getClass(), "gradeRank", -1652703439);
        setIntField(term4290430, term4290430.getClass(), "classRank", -1524146475);
        setIntField(term4290430, term4290430.getClass(), "courseRank", -56634507);
        setField(term4290430, term4290430.getClass(), "charaSlot", term4290495);
        setField(term4290430, term4290430.getClass(), "charaLockSlot", term4290509);
        setLongField(term4290430, term4290430.getClass(), "contentBit", -1413092690523015099L);
        setIntField(term4290430, term4290430.getClass(), "playCount", -550954214);
        setField(term4290430, term4290430.getClass(), "eventWatchedDate", "ZUIAxcSSBz");
        setField(term4290430, term4290430.getClass(), "lastGameId", "raCgESIxyp");
        setField(term4290430, term4290430.getClass(), "lastRomVersion", "EgdEtFMLgd");
        setField(term4290430, term4290430.getClass(), "lastDataVersion", "VnztxjaZJL");
        setField(term4290430, term4290430.getClass(), "lastLoginDate", "qQGVldvoGQ");
        setField(term4290430, term4290430.getClass(), "lastPlayDate", "LIRDfzstiW");
        setIntField(term4290430, term4290430.getClass(), "lastPlayCredit", -265246152);
        setIntField(term4290430, term4290430.getClass(), "lastPlayMode", -1396584984);
        setIntField(term4290430, term4290430.getClass(), "lastPlaceId", -770718984);
        setField(term4290430, term4290430.getClass(), "lastPlaceName", "PoOrSzuzBb");
        setIntField(term4290430, term4290430.getClass(), "lastAllNetId", -34443373);
        setIntField(term4290430, term4290430.getClass(), "lastRegionId", -1971253008);
        setField(term4290430, term4290430.getClass(), "lastRegionName", "XJnEMqksHs");
        setField(term4290430, term4290430.getClass(), "lastClientId", "STRdcNqeud");
        setField(term4290430, term4290430.getClass(), "lastCountryCode", "blQopUxHTf");
        setIntField(term4290430, term4290430.getClass(), "lastSelectEMoney", -1944578498);
        setIntField(term4290430, term4290430.getClass(), "lastSelectTicket", 1047578124);
        setIntField(term4290430, term4290430.getClass(), "lastSelectCourse", -1686398184);
        setIntField(term4290430, term4290430.getClass(), "lastCountCourse", 1803245766);
        setField(term4290430, term4290430.getClass(), "firstGameId", "nOIUWVuMfZ");
        setField(term4290430, term4290430.getClass(), "firstRomVersion", "LylsSxOXOy");
        setField(term4290430, term4290430.getClass(), "firstDataVersion", "PQQfusmMYX");
        setField(term4290430, term4290430.getClass(), "firstPlayDate", "hEgnPgOoOb");
        setField(term4290430, term4290430.getClass(), "compatibleCmVersion", "qFWeZtajCM");
        setField(term4290430, term4290430.getClass(), "dailyBonusDate", "juXckABBxg");
        setField(term4290430, term4290430.getClass(), "dailyCourseBonusDate", "PtbFjiahgZ");
        setField(term4290430, term4290430.getClass(), "lastPairLoginDate", "sTkIurAQEE");
        setField(term4290430, term4290430.getClass(), "lastTrialPlayDate", "iRMJDwstrK");
        setIntField(term4290430, term4290430.getClass(), "playVsCount", -1341334090);
        setIntField(term4290430, term4290430.getClass(), "playSyncCount", 715018401);
        setIntField(term4290430, term4290430.getClass(), "winCount", -1869686353);
        setIntField(term4290430, term4290430.getClass(), "helpCount", 1740963405);
        setIntField(term4290430, term4290430.getClass(), "comboCount", 1788904152);
        setLongField(term4290430, term4290430.getClass(), "totalDeluxscore", 6054801484712177063L);
        setLongField(term4290430, term4290430.getClass(), "totalBasicDeluxscore", -9010564231133587246L);
        setLongField(term4290430, term4290430.getClass(), "totalAdvancedDeluxscore", -4025756447839998239L);
        setLongField(term4290430, term4290430.getClass(), "totalExpertDeluxscore", -3389238171761363080L);
        setLongField(term4290430, term4290430.getClass(), "totalMasterDeluxscore", -9055546712615114068L);
        setLongField(term4290430, term4290430.getClass(), "totalReMasterDeluxscore", -6533445556080861050L);
        setIntField(term4290430, term4290430.getClass(), "totalSync", 597532620);
        setIntField(term4290430, term4290430.getClass(), "totalBasicSync", 1685436128);
        setIntField(term4290430, term4290430.getClass(), "totalAdvancedSync", -2126881270);
        setIntField(term4290430, term4290430.getClass(), "totalExpertSync", -16902378);
        setIntField(term4290430, term4290430.getClass(), "totalMasterSync", -743612230);
        setIntField(term4290430, term4290430.getClass(), "totalReMasterSync", 1771199387);
        setLongField(term4290430, term4290430.getClass(), "totalAchievement", 7395063613816970989L);
        setLongField(term4290430, term4290430.getClass(), "totalBasicAchievement", -164307735294893755L);
        setLongField(term4290430, term4290430.getClass(), "totalAdvancedAchievement", -4931653689608925944L);
        setLongField(term4290430, term4290430.getClass(), "totalExpertAchievement", -6297787619835823848L);
        setLongField(term4290430, term4290430.getClass(), "totalMasterAchievement", 3904745275684096422L);
        setLongField(term4290430, term4290430.getClass(), "totalReMasterAchievement", -1865009796597417762L);
        setLongField(term4290430, term4290430.getClass(), "playerOldRating", -4490200220402563912L);
        setLongField(term4290430, term4290430.getClass(), "playerNewRating", 3665809182457623706L);
        setIntField(term4290430, term4290430.getClass(), "banState", 1449113227);
        setLongField(term4290430, term4290430.getClass(), "dateTime", -6216990359372886598L);
        term4290789 = new Integer(-555271852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4290789;
        callMethod(klass, "setLastPlaceId", argTypes, term4290430, args);
    }

};


