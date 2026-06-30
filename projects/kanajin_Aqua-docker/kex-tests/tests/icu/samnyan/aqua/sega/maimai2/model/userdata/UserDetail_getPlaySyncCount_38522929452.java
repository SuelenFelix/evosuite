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

public class UserDetail_getPlaySyncCount_38522929452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224512;

    public UserDetail_getPlaySyncCount_38522929452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term224516 = new Long(9174730812791817537L);
        Integer term224579 = new Integer(2030509680);
        Integer term224581 = new Integer(-927217294);
        Integer term224583 = new Integer(-157082836);
        ArrayList term224577 = new ArrayList();
        ((ArrayList) term224577).add(term224579);
        ((ArrayList) term224577).add(term224581);
        ((ArrayList) term224577).add(term224583);
        ArrayList term224587 = new ArrayList();
        term224512 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term224514 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term224530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224535 = newInstance(Class.forName("java.time.LocalTime"));
        Object term224540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224545 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term224512, term224512.getClass(), "id", 1802223650726139040L);
        setLongField(term224514, term224514.getClass(), "id", 5650647751145506885L);
        setField(term224514, term224514.getClass(), "extId", term224516);
        setField(term224514, term224514.getClass(), "luid", "DjtLoBcwMe");
        setIntField(term224531, term224531.getClass(), "year", 2019);
        setShortField(term224531, term224531.getClass(), "month", (short) 3);
        setShortField(term224531, term224531.getClass(), "day", (short) 14);
        setField(term224530, term224530.getClass(), "date", term224531);
        setByteField(term224535, term224535.getClass(), "hour", (byte) 21);
        setByteField(term224535, term224535.getClass(), "minute", (byte) 1);
        setByteField(term224535, term224535.getClass(), "second", (byte) 27);
        setIntField(term224535, term224535.getClass(), "nano", 855781320);
        setField(term224530, term224530.getClass(), "time", term224535);
        setField(term224514, term224514.getClass(), "registerTime", term224530);
        setIntField(term224541, term224541.getClass(), "year", 2010);
        setShortField(term224541, term224541.getClass(), "month", (short) 2);
        setShortField(term224541, term224541.getClass(), "day", (short) 1);
        setField(term224540, term224540.getClass(), "date", term224541);
        setByteField(term224545, term224545.getClass(), "hour", (byte) 15);
        setByteField(term224545, term224545.getClass(), "minute", (byte) 12);
        setByteField(term224545, term224545.getClass(), "second", (byte) 8);
        setIntField(term224545, term224545.getClass(), "nano", 722621943);
        setField(term224540, term224540.getClass(), "time", term224545);
        setField(term224514, term224514.getClass(), "accessTime", term224540);
        setField(term224512, term224512.getClass(), "card", term224514);
        setField(term224512, term224512.getClass(), "userName", "meUVYWhBFo");
        setIntField(term224512, term224512.getClass(), "isNetMember", 1135106965);
        setIntField(term224512, term224512.getClass(), "iconId", 1832192277);
        setIntField(term224512, term224512.getClass(), "plateId", 1254864568);
        setIntField(term224512, term224512.getClass(), "titleId", -571619755);
        setIntField(term224512, term224512.getClass(), "partnerId", 451376857);
        setIntField(term224512, term224512.getClass(), "frameId", -1991834397);
        setIntField(term224512, term224512.getClass(), "selectMapId", -1181437252);
        setIntField(term224512, term224512.getClass(), "totalAwake", 1473244237);
        setIntField(term224512, term224512.getClass(), "gradeRating", 1217408539);
        setIntField(term224512, term224512.getClass(), "musicRating", -80988884);
        setIntField(term224512, term224512.getClass(), "playerRating", 1775341759);
        setIntField(term224512, term224512.getClass(), "highestRating", -1260716399);
        setIntField(term224512, term224512.getClass(), "gradeRank", 2009351154);
        setIntField(term224512, term224512.getClass(), "classRank", -1078550468);
        setIntField(term224512, term224512.getClass(), "courseRank", -1867741312);
        setField(term224512, term224512.getClass(), "charaSlot", term224577);
        setField(term224512, term224512.getClass(), "charaLockSlot", term224587);
        setLongField(term224512, term224512.getClass(), "contentBit", 8348501915993953384L);
        setIntField(term224512, term224512.getClass(), "playCount", -795605694);
        setField(term224512, term224512.getClass(), "eventWatchedDate", "JjmysiVNEh");
        setField(term224512, term224512.getClass(), "lastGameId", "xsRfZCAubi");
        setField(term224512, term224512.getClass(), "lastRomVersion", "vRtHDpAuWX");
        setField(term224512, term224512.getClass(), "lastDataVersion", "KzggKElOWW");
        setField(term224512, term224512.getClass(), "lastLoginDate", "rOJFLnnriK");
        setField(term224512, term224512.getClass(), "lastPlayDate", "uxPZLhUnKh");
        setIntField(term224512, term224512.getClass(), "lastPlayCredit", -1791286061);
        setIntField(term224512, term224512.getClass(), "lastPlayMode", -326801646);
        setIntField(term224512, term224512.getClass(), "lastPlaceId", 1716329981);
        setField(term224512, term224512.getClass(), "lastPlaceName", "BuOyamVtMR");
        setIntField(term224512, term224512.getClass(), "lastAllNetId", 1984104176);
        setIntField(term224512, term224512.getClass(), "lastRegionId", 1030528931);
        setField(term224512, term224512.getClass(), "lastRegionName", "xWMVBrrOyw");
        setField(term224512, term224512.getClass(), "lastClientId", "SLOZSlbZhc");
        setField(term224512, term224512.getClass(), "lastCountryCode", "EqpGeKZRCt");
        setIntField(term224512, term224512.getClass(), "lastSelectEMoney", 2054837350);
        setIntField(term224512, term224512.getClass(), "lastSelectTicket", 1209247785);
        setIntField(term224512, term224512.getClass(), "lastSelectCourse", 1950406971);
        setIntField(term224512, term224512.getClass(), "lastCountCourse", 1834357646);
        setField(term224512, term224512.getClass(), "firstGameId", "ZPbOWzPADZ");
        setField(term224512, term224512.getClass(), "firstRomVersion", "oBknhKKIFK");
        setField(term224512, term224512.getClass(), "firstDataVersion", "tfUFeoWiTr");
        setField(term224512, term224512.getClass(), "firstPlayDate", "hMVaHWQXZO");
        setField(term224512, term224512.getClass(), "compatibleCmVersion", "njWnMTRwPZ");
        setField(term224512, term224512.getClass(), "dailyBonusDate", "XZfXhKtihX");
        setField(term224512, term224512.getClass(), "dailyCourseBonusDate", "mmHuLwDpkf");
        setField(term224512, term224512.getClass(), "lastPairLoginDate", "GjyMraKalr");
        setField(term224512, term224512.getClass(), "lastTrialPlayDate", "wZnhIfXRJr");
        setIntField(term224512, term224512.getClass(), "playVsCount", -934619156);
        setIntField(term224512, term224512.getClass(), "playSyncCount", 751000283);
        setIntField(term224512, term224512.getClass(), "winCount", -591472707);
        setIntField(term224512, term224512.getClass(), "helpCount", -670816490);
        setIntField(term224512, term224512.getClass(), "comboCount", -552668710);
        setLongField(term224512, term224512.getClass(), "totalDeluxscore", -3744776131666873745L);
        setLongField(term224512, term224512.getClass(), "totalBasicDeluxscore", 5916711676141065738L);
        setLongField(term224512, term224512.getClass(), "totalAdvancedDeluxscore", 1122241556844575286L);
        setLongField(term224512, term224512.getClass(), "totalExpertDeluxscore", -4081932476065206064L);
        setLongField(term224512, term224512.getClass(), "totalMasterDeluxscore", 4804861320458212945L);
        setLongField(term224512, term224512.getClass(), "totalReMasterDeluxscore", -8909583119182461015L);
        setIntField(term224512, term224512.getClass(), "totalSync", -760927478);
        setIntField(term224512, term224512.getClass(), "totalBasicSync", -619141849);
        setIntField(term224512, term224512.getClass(), "totalAdvancedSync", 1930976366);
        setIntField(term224512, term224512.getClass(), "totalExpertSync", -539700568);
        setIntField(term224512, term224512.getClass(), "totalMasterSync", 1235020855);
        setIntField(term224512, term224512.getClass(), "totalReMasterSync", 589191849);
        setLongField(term224512, term224512.getClass(), "totalAchievement", 8112908390673739352L);
        setLongField(term224512, term224512.getClass(), "totalBasicAchievement", 8506387940383586093L);
        setLongField(term224512, term224512.getClass(), "totalAdvancedAchievement", -3396931832744828318L);
        setLongField(term224512, term224512.getClass(), "totalExpertAchievement", 58949307114037214L);
        setLongField(term224512, term224512.getClass(), "totalMasterAchievement", 7467886048752150766L);
        setLongField(term224512, term224512.getClass(), "totalReMasterAchievement", -6980310935600459599L);
        setLongField(term224512, term224512.getClass(), "playerOldRating", 5718709907715139334L);
        setLongField(term224512, term224512.getClass(), "playerNewRating", 7874544298926560716L);
        setIntField(term224512, term224512.getClass(), "banState", -400353527);
        setLongField(term224512, term224512.getClass(), "dateTime", 4889444909547333281L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaySyncCount", argTypes, term224512, args);
    }

};


