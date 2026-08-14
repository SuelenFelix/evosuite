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

public class UserDetail_getBanState_166129641675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237977;

    public UserDetail_getBanState_166129641675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term237981 = new Long(8010417010297313651L);
        Integer term238044 = new Integer(909183017);
        ArrayList term238042 = new ArrayList();
        ((ArrayList) term238042).add(term238044);
        Integer term238050 = new Integer(-2115858923);
        Integer term238052 = new Integer(1709658376);
        Integer term238054 = new Integer(-1235730396);
        Integer term238056 = new Integer(-366600678);
        Integer term238058 = new Integer(-1641994868);
        Integer term238060 = new Integer(1729072481);
        Integer term238062 = new Integer(-1281635786);
        Integer term238064 = new Integer(1768552438);
        ArrayList term238048 = new ArrayList();
        ((ArrayList) term238048).add(term238050);
        ((ArrayList) term238048).add(term238052);
        ((ArrayList) term238048).add(term238054);
        ((ArrayList) term238048).add(term238056);
        ((ArrayList) term238048).add(term238058);
        ((ArrayList) term238048).add(term238060);
        ((ArrayList) term238048).add(term238062);
        ((ArrayList) term238048).add(term238064);
        term237977 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term237979 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term237995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term237996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238000 = newInstance(Class.forName("java.time.LocalTime"));
        Object term238005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238010 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term237977, term237977.getClass(), "id", 7741646591388121594L);
        setLongField(term237979, term237979.getClass(), "id", -2594352270951496749L);
        setField(term237979, term237979.getClass(), "extId", term237981);
        setField(term237979, term237979.getClass(), "luid", "CzDfpcxVwI");
        setIntField(term237996, term237996.getClass(), "year", 2025);
        setShortField(term237996, term237996.getClass(), "month", (short) 7);
        setShortField(term237996, term237996.getClass(), "day", (short) 22);
        setField(term237995, term237995.getClass(), "date", term237996);
        setByteField(term238000, term238000.getClass(), "hour", (byte) 19);
        setByteField(term238000, term238000.getClass(), "minute", (byte) 18);
        setByteField(term238000, term238000.getClass(), "second", (byte) 28);
        setIntField(term238000, term238000.getClass(), "nano", 975087142);
        setField(term237995, term237995.getClass(), "time", term238000);
        setField(term237979, term237979.getClass(), "registerTime", term237995);
        setIntField(term238006, term238006.getClass(), "year", 2018);
        setShortField(term238006, term238006.getClass(), "month", (short) 6);
        setShortField(term238006, term238006.getClass(), "day", (short) 29);
        setField(term238005, term238005.getClass(), "date", term238006);
        setByteField(term238010, term238010.getClass(), "hour", (byte) 0);
        setByteField(term238010, term238010.getClass(), "minute", (byte) 24);
        setByteField(term238010, term238010.getClass(), "second", (byte) 5);
        setIntField(term238010, term238010.getClass(), "nano", 130907665);
        setField(term238005, term238005.getClass(), "time", term238010);
        setField(term237979, term237979.getClass(), "accessTime", term238005);
        setField(term237977, term237977.getClass(), "card", term237979);
        setField(term237977, term237977.getClass(), "userName", "sUKfpEKBAS");
        setIntField(term237977, term237977.getClass(), "isNetMember", -1918459934);
        setIntField(term237977, term237977.getClass(), "iconId", -1518816079);
        setIntField(term237977, term237977.getClass(), "plateId", -1959564399);
        setIntField(term237977, term237977.getClass(), "titleId", 789264413);
        setIntField(term237977, term237977.getClass(), "partnerId", 1411543119);
        setIntField(term237977, term237977.getClass(), "frameId", 21102667);
        setIntField(term237977, term237977.getClass(), "selectMapId", -1730684267);
        setIntField(term237977, term237977.getClass(), "totalAwake", -291152891);
        setIntField(term237977, term237977.getClass(), "gradeRating", 527391816);
        setIntField(term237977, term237977.getClass(), "musicRating", 407142365);
        setIntField(term237977, term237977.getClass(), "playerRating", -303557577);
        setIntField(term237977, term237977.getClass(), "highestRating", -24241468);
        setIntField(term237977, term237977.getClass(), "gradeRank", 1648187712);
        setIntField(term237977, term237977.getClass(), "classRank", -1643165362);
        setIntField(term237977, term237977.getClass(), "courseRank", 644721007);
        setField(term237977, term237977.getClass(), "charaSlot", term238042);
        setField(term237977, term237977.getClass(), "charaLockSlot", term238048);
        setLongField(term237977, term237977.getClass(), "contentBit", 4263846353104131296L);
        setIntField(term237977, term237977.getClass(), "playCount", -1061030332);
        setField(term237977, term237977.getClass(), "eventWatchedDate", "anfAMeVVsC");
        setField(term237977, term237977.getClass(), "lastGameId", "GlIWuwNnwL");
        setField(term237977, term237977.getClass(), "lastRomVersion", "HDsXonVTyY");
        setField(term237977, term237977.getClass(), "lastDataVersion", "BusZaRriAA");
        setField(term237977, term237977.getClass(), "lastLoginDate", "imlbrmsABR");
        setField(term237977, term237977.getClass(), "lastPlayDate", "VozwaeTzwB");
        setIntField(term237977, term237977.getClass(), "lastPlayCredit", 1719003803);
        setIntField(term237977, term237977.getClass(), "lastPlayMode", 1792293745);
        setIntField(term237977, term237977.getClass(), "lastPlaceId", 294713671);
        setField(term237977, term237977.getClass(), "lastPlaceName", "NzhnvXaHzq");
        setIntField(term237977, term237977.getClass(), "lastAllNetId", 1869812691);
        setIntField(term237977, term237977.getClass(), "lastRegionId", 1131021258);
        setField(term237977, term237977.getClass(), "lastRegionName", "JkfLtSQjWq");
        setField(term237977, term237977.getClass(), "lastClientId", "JpZUfTkpjW");
        setField(term237977, term237977.getClass(), "lastCountryCode", "SbMMeUExqe");
        setIntField(term237977, term237977.getClass(), "lastSelectEMoney", 1216297099);
        setIntField(term237977, term237977.getClass(), "lastSelectTicket", 1287631638);
        setIntField(term237977, term237977.getClass(), "lastSelectCourse", -447126454);
        setIntField(term237977, term237977.getClass(), "lastCountCourse", 1697871767);
        setField(term237977, term237977.getClass(), "firstGameId", "CKFhbAWYOu");
        setField(term237977, term237977.getClass(), "firstRomVersion", "cjASmDMJyf");
        setField(term237977, term237977.getClass(), "firstDataVersion", "ALbKTRphvX");
        setField(term237977, term237977.getClass(), "firstPlayDate", "vWbSXhWaUM");
        setField(term237977, term237977.getClass(), "compatibleCmVersion", "xGZegFGFwp");
        setField(term237977, term237977.getClass(), "dailyBonusDate", "mcyLkkYdqH");
        setField(term237977, term237977.getClass(), "dailyCourseBonusDate", "NgPHLrUVTl");
        setField(term237977, term237977.getClass(), "lastPairLoginDate", "cGSjeMMyEG");
        setField(term237977, term237977.getClass(), "lastTrialPlayDate", "zDxtwCfvRN");
        setIntField(term237977, term237977.getClass(), "playVsCount", -1700264686);
        setIntField(term237977, term237977.getClass(), "playSyncCount", 1753008116);
        setIntField(term237977, term237977.getClass(), "winCount", 1276815986);
        setIntField(term237977, term237977.getClass(), "helpCount", -521303871);
        setIntField(term237977, term237977.getClass(), "comboCount", -1392718153);
        setLongField(term237977, term237977.getClass(), "totalDeluxscore", 4269601655699880663L);
        setLongField(term237977, term237977.getClass(), "totalBasicDeluxscore", 9033590544636648348L);
        setLongField(term237977, term237977.getClass(), "totalAdvancedDeluxscore", 7635030261214995387L);
        setLongField(term237977, term237977.getClass(), "totalExpertDeluxscore", 1936080764887985376L);
        setLongField(term237977, term237977.getClass(), "totalMasterDeluxscore", 4926815456683112972L);
        setLongField(term237977, term237977.getClass(), "totalReMasterDeluxscore", -7395483518509710498L);
        setIntField(term237977, term237977.getClass(), "totalSync", -256278679);
        setIntField(term237977, term237977.getClass(), "totalBasicSync", -524155996);
        setIntField(term237977, term237977.getClass(), "totalAdvancedSync", -1349685301);
        setIntField(term237977, term237977.getClass(), "totalExpertSync", -2128633946);
        setIntField(term237977, term237977.getClass(), "totalMasterSync", 1147052903);
        setIntField(term237977, term237977.getClass(), "totalReMasterSync", 328521391);
        setLongField(term237977, term237977.getClass(), "totalAchievement", -7944848809682738791L);
        setLongField(term237977, term237977.getClass(), "totalBasicAchievement", 2420176577964050902L);
        setLongField(term237977, term237977.getClass(), "totalAdvancedAchievement", 4130720357611521038L);
        setLongField(term237977, term237977.getClass(), "totalExpertAchievement", 5857668486465858383L);
        setLongField(term237977, term237977.getClass(), "totalMasterAchievement", 628820741062223072L);
        setLongField(term237977, term237977.getClass(), "totalReMasterAchievement", 5897862370785158052L);
        setLongField(term237977, term237977.getClass(), "playerOldRating", -5597177338252488848L);
        setLongField(term237977, term237977.getClass(), "playerNewRating", 917705180049298498L);
        setIntField(term237977, term237977.getClass(), "banState", 2086464016);
        setLongField(term237977, term237977.getClass(), "dateTime", 8038992748503712618L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBanState", argTypes, term237977, args);
    }

};


