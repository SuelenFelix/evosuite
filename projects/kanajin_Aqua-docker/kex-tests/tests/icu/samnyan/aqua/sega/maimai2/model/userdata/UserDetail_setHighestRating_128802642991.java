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

public class UserDetail_setHighestRating_128802642991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247099;
     Object term247450;

    public UserDetail_setHighestRating_128802642991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term247103 = new Long(6940486570215409900L);
        Integer term247166 = new Integer(518095920);
        Integer term247168 = new Integer(1333750018);
        Integer term247170 = new Integer(1824319777);
        Integer term247172 = new Integer(-942865663);
        ArrayList term247164 = new ArrayList();
        ((ArrayList) term247164).add(term247166);
        ((ArrayList) term247164).add(term247168);
        ((ArrayList) term247164).add(term247170);
        ((ArrayList) term247164).add(term247172);
        Integer term247178 = new Integer(612230460);
        Integer term247180 = new Integer(-87837417);
        ArrayList term247176 = new ArrayList();
        ((ArrayList) term247176).add(term247178);
        ((ArrayList) term247176).add(term247180);
        term247099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term247101 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term247117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term247127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247132 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term247099, term247099.getClass(), "id", 3317613762910755461L);
        setLongField(term247101, term247101.getClass(), "id", 7181426059438248060L);
        setField(term247101, term247101.getClass(), "extId", term247103);
        setField(term247101, term247101.getClass(), "luid", "hjlLFUSUSr");
        setIntField(term247118, term247118.getClass(), "year", 2024);
        setShortField(term247118, term247118.getClass(), "month", (short) 5);
        setShortField(term247118, term247118.getClass(), "day", (short) 7);
        setField(term247117, term247117.getClass(), "date", term247118);
        setByteField(term247122, term247122.getClass(), "hour", (byte) 11);
        setByteField(term247122, term247122.getClass(), "minute", (byte) 43);
        setByteField(term247122, term247122.getClass(), "second", (byte) 25);
        setIntField(term247122, term247122.getClass(), "nano", 863939499);
        setField(term247117, term247117.getClass(), "time", term247122);
        setField(term247101, term247101.getClass(), "registerTime", term247117);
        setIntField(term247128, term247128.getClass(), "year", 2024);
        setShortField(term247128, term247128.getClass(), "month", (short) 9);
        setShortField(term247128, term247128.getClass(), "day", (short) 7);
        setField(term247127, term247127.getClass(), "date", term247128);
        setByteField(term247132, term247132.getClass(), "hour", (byte) 10);
        setByteField(term247132, term247132.getClass(), "minute", (byte) 12);
        setByteField(term247132, term247132.getClass(), "second", (byte) 46);
        setIntField(term247132, term247132.getClass(), "nano", 856869732);
        setField(term247127, term247127.getClass(), "time", term247132);
        setField(term247101, term247101.getClass(), "accessTime", term247127);
        setField(term247099, term247099.getClass(), "card", term247101);
        setField(term247099, term247099.getClass(), "userName", "kcBYZtVjEn");
        setIntField(term247099, term247099.getClass(), "isNetMember", -583672343);
        setIntField(term247099, term247099.getClass(), "iconId", 1468999437);
        setIntField(term247099, term247099.getClass(), "plateId", 1413900695);
        setIntField(term247099, term247099.getClass(), "titleId", -479962825);
        setIntField(term247099, term247099.getClass(), "partnerId", 1779819594);
        setIntField(term247099, term247099.getClass(), "frameId", 1985056540);
        setIntField(term247099, term247099.getClass(), "selectMapId", -226386721);
        setIntField(term247099, term247099.getClass(), "totalAwake", 1013063751);
        setIntField(term247099, term247099.getClass(), "gradeRating", -1198391913);
        setIntField(term247099, term247099.getClass(), "musicRating", 68033708);
        setIntField(term247099, term247099.getClass(), "playerRating", 2051874969);
        setIntField(term247099, term247099.getClass(), "highestRating", 2076756563);
        setIntField(term247099, term247099.getClass(), "gradeRank", 601795101);
        setIntField(term247099, term247099.getClass(), "classRank", -1062808229);
        setIntField(term247099, term247099.getClass(), "courseRank", -271441350);
        setField(term247099, term247099.getClass(), "charaSlot", term247164);
        setField(term247099, term247099.getClass(), "charaLockSlot", term247176);
        setLongField(term247099, term247099.getClass(), "contentBit", 1878387864306336669L);
        setIntField(term247099, term247099.getClass(), "playCount", 1670662698);
        setField(term247099, term247099.getClass(), "eventWatchedDate", "zVemyNDAME");
        setField(term247099, term247099.getClass(), "lastGameId", "wTfSVITNMz");
        setField(term247099, term247099.getClass(), "lastRomVersion", "pNYXsbHfzE");
        setField(term247099, term247099.getClass(), "lastDataVersion", "DWQRVUVtua");
        setField(term247099, term247099.getClass(), "lastLoginDate", "eDVTORBely");
        setField(term247099, term247099.getClass(), "lastPlayDate", "AoncmgwbVO");
        setIntField(term247099, term247099.getClass(), "lastPlayCredit", -1572888982);
        setIntField(term247099, term247099.getClass(), "lastPlayMode", 2135550662);
        setIntField(term247099, term247099.getClass(), "lastPlaceId", -455562432);
        setField(term247099, term247099.getClass(), "lastPlaceName", "RDNNYsIlUn");
        setIntField(term247099, term247099.getClass(), "lastAllNetId", -80827488);
        setIntField(term247099, term247099.getClass(), "lastRegionId", -992927508);
        setField(term247099, term247099.getClass(), "lastRegionName", "bLadkkAEee");
        setField(term247099, term247099.getClass(), "lastClientId", "wYWbALYzmk");
        setField(term247099, term247099.getClass(), "lastCountryCode", "OlbnRaLyPO");
        setIntField(term247099, term247099.getClass(), "lastSelectEMoney", -2071989918);
        setIntField(term247099, term247099.getClass(), "lastSelectTicket", -1383632524);
        setIntField(term247099, term247099.getClass(), "lastSelectCourse", 1357437054);
        setIntField(term247099, term247099.getClass(), "lastCountCourse", -1042866729);
        setField(term247099, term247099.getClass(), "firstGameId", "goQZKOBhTr");
        setField(term247099, term247099.getClass(), "firstRomVersion", "eaDGkLMDMl");
        setField(term247099, term247099.getClass(), "firstDataVersion", "dfvKtdkmjZ");
        setField(term247099, term247099.getClass(), "firstPlayDate", "XOFlovlfIj");
        setField(term247099, term247099.getClass(), "compatibleCmVersion", "gdTreEAwDY");
        setField(term247099, term247099.getClass(), "dailyBonusDate", "JEuvsJnhAW");
        setField(term247099, term247099.getClass(), "dailyCourseBonusDate", "qrIWqPjdov");
        setField(term247099, term247099.getClass(), "lastPairLoginDate", "chPkouOrOD");
        setField(term247099, term247099.getClass(), "lastTrialPlayDate", "VKPVssVIga");
        setIntField(term247099, term247099.getClass(), "playVsCount", 65417356);
        setIntField(term247099, term247099.getClass(), "playSyncCount", 1998186352);
        setIntField(term247099, term247099.getClass(), "winCount", 1778792634);
        setIntField(term247099, term247099.getClass(), "helpCount", -477162164);
        setIntField(term247099, term247099.getClass(), "comboCount", -1397399586);
        setLongField(term247099, term247099.getClass(), "totalDeluxscore", -8821230925120968379L);
        setLongField(term247099, term247099.getClass(), "totalBasicDeluxscore", -1650399504002551176L);
        setLongField(term247099, term247099.getClass(), "totalAdvancedDeluxscore", 7734375040858265011L);
        setLongField(term247099, term247099.getClass(), "totalExpertDeluxscore", 2812254788428165456L);
        setLongField(term247099, term247099.getClass(), "totalMasterDeluxscore", -4224144508839133515L);
        setLongField(term247099, term247099.getClass(), "totalReMasterDeluxscore", 8856488457240145572L);
        setIntField(term247099, term247099.getClass(), "totalSync", -1933029024);
        setIntField(term247099, term247099.getClass(), "totalBasicSync", 954573287);
        setIntField(term247099, term247099.getClass(), "totalAdvancedSync", 1974486967);
        setIntField(term247099, term247099.getClass(), "totalExpertSync", -1788451389);
        setIntField(term247099, term247099.getClass(), "totalMasterSync", -1198136820);
        setIntField(term247099, term247099.getClass(), "totalReMasterSync", 981813742);
        setLongField(term247099, term247099.getClass(), "totalAchievement", -5877196172319571618L);
        setLongField(term247099, term247099.getClass(), "totalBasicAchievement", -3352307422764396158L);
        setLongField(term247099, term247099.getClass(), "totalAdvancedAchievement", -4518293857308776760L);
        setLongField(term247099, term247099.getClass(), "totalExpertAchievement", -1153627645527650808L);
        setLongField(term247099, term247099.getClass(), "totalMasterAchievement", 2341193937000527412L);
        setLongField(term247099, term247099.getClass(), "totalReMasterAchievement", -4124169065087009241L);
        setLongField(term247099, term247099.getClass(), "playerOldRating", 6480775153663346038L);
        setLongField(term247099, term247099.getClass(), "playerNewRating", -1343518427891203414L);
        setIntField(term247099, term247099.getClass(), "banState", 949470328);
        setLongField(term247099, term247099.getClass(), "dateTime", 968043942193261455L);
        term247450 = new Integer(-1848906931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term247450;
        callMethod(klass, "setHighestRating", argTypes, term247099, args);
    }

};


