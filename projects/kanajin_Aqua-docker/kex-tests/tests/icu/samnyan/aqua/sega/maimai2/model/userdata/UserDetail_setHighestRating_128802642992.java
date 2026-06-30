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

public class UserDetail_setHighestRating_128802642992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247154;
     Object term247505;

    public UserDetail_setHighestRating_128802642992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term247158 = new Long(6940486570215409900L);
        Integer term247221 = new Integer(518095920);
        Integer term247223 = new Integer(1333750018);
        Integer term247225 = new Integer(1824319777);
        Integer term247227 = new Integer(-942865663);
        ArrayList term247219 = new ArrayList();
        ((ArrayList) term247219).add(term247221);
        ((ArrayList) term247219).add(term247223);
        ((ArrayList) term247219).add(term247225);
        ((ArrayList) term247219).add(term247227);
        Integer term247233 = new Integer(612230460);
        Integer term247235 = new Integer(-87837417);
        ArrayList term247231 = new ArrayList();
        ((ArrayList) term247231).add(term247233);
        ((ArrayList) term247231).add(term247235);
        term247154 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term247156 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term247172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term247182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247187 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term247154, term247154.getClass(), "id", 3317613762910755461L);
        setLongField(term247156, term247156.getClass(), "id", 7181426059438248060L);
        setField(term247156, term247156.getClass(), "extId", term247158);
        setField(term247156, term247156.getClass(), "luid", "hjlLFUSUSr");
        setIntField(term247173, term247173.getClass(), "year", 2024);
        setShortField(term247173, term247173.getClass(), "month", (short) 5);
        setShortField(term247173, term247173.getClass(), "day", (short) 7);
        setField(term247172, term247172.getClass(), "date", term247173);
        setByteField(term247177, term247177.getClass(), "hour", (byte) 11);
        setByteField(term247177, term247177.getClass(), "minute", (byte) 43);
        setByteField(term247177, term247177.getClass(), "second", (byte) 25);
        setIntField(term247177, term247177.getClass(), "nano", 863939499);
        setField(term247172, term247172.getClass(), "time", term247177);
        setField(term247156, term247156.getClass(), "registerTime", term247172);
        setIntField(term247183, term247183.getClass(), "year", 2024);
        setShortField(term247183, term247183.getClass(), "month", (short) 9);
        setShortField(term247183, term247183.getClass(), "day", (short) 7);
        setField(term247182, term247182.getClass(), "date", term247183);
        setByteField(term247187, term247187.getClass(), "hour", (byte) 10);
        setByteField(term247187, term247187.getClass(), "minute", (byte) 12);
        setByteField(term247187, term247187.getClass(), "second", (byte) 46);
        setIntField(term247187, term247187.getClass(), "nano", 856869732);
        setField(term247182, term247182.getClass(), "time", term247187);
        setField(term247156, term247156.getClass(), "accessTime", term247182);
        setField(term247154, term247154.getClass(), "card", term247156);
        setField(term247154, term247154.getClass(), "userName", "kcBYZtVjEn");
        setIntField(term247154, term247154.getClass(), "isNetMember", -583672343);
        setIntField(term247154, term247154.getClass(), "iconId", 1468999437);
        setIntField(term247154, term247154.getClass(), "plateId", 1413900695);
        setIntField(term247154, term247154.getClass(), "titleId", -479962825);
        setIntField(term247154, term247154.getClass(), "partnerId", 1779819594);
        setIntField(term247154, term247154.getClass(), "frameId", 1985056540);
        setIntField(term247154, term247154.getClass(), "selectMapId", -226386721);
        setIntField(term247154, term247154.getClass(), "totalAwake", 1013063751);
        setIntField(term247154, term247154.getClass(), "gradeRating", -1198391913);
        setIntField(term247154, term247154.getClass(), "musicRating", 68033708);
        setIntField(term247154, term247154.getClass(), "playerRating", 2051874969);
        setIntField(term247154, term247154.getClass(), "highestRating", 2076756563);
        setIntField(term247154, term247154.getClass(), "gradeRank", 601795101);
        setIntField(term247154, term247154.getClass(), "classRank", -1062808229);
        setIntField(term247154, term247154.getClass(), "courseRank", -271441350);
        setField(term247154, term247154.getClass(), "charaSlot", term247219);
        setField(term247154, term247154.getClass(), "charaLockSlot", term247231);
        setLongField(term247154, term247154.getClass(), "contentBit", 1878387864306336669L);
        setIntField(term247154, term247154.getClass(), "playCount", 1670662698);
        setField(term247154, term247154.getClass(), "eventWatchedDate", "zVemyNDAME");
        setField(term247154, term247154.getClass(), "lastGameId", "wTfSVITNMz");
        setField(term247154, term247154.getClass(), "lastRomVersion", "pNYXsbHfzE");
        setField(term247154, term247154.getClass(), "lastDataVersion", "DWQRVUVtua");
        setField(term247154, term247154.getClass(), "lastLoginDate", "eDVTORBely");
        setField(term247154, term247154.getClass(), "lastPlayDate", "AoncmgwbVO");
        setIntField(term247154, term247154.getClass(), "lastPlayCredit", -1572888982);
        setIntField(term247154, term247154.getClass(), "lastPlayMode", 2135550662);
        setIntField(term247154, term247154.getClass(), "lastPlaceId", -455562432);
        setField(term247154, term247154.getClass(), "lastPlaceName", "RDNNYsIlUn");
        setIntField(term247154, term247154.getClass(), "lastAllNetId", -80827488);
        setIntField(term247154, term247154.getClass(), "lastRegionId", -992927508);
        setField(term247154, term247154.getClass(), "lastRegionName", "bLadkkAEee");
        setField(term247154, term247154.getClass(), "lastClientId", "wYWbALYzmk");
        setField(term247154, term247154.getClass(), "lastCountryCode", "OlbnRaLyPO");
        setIntField(term247154, term247154.getClass(), "lastSelectEMoney", -2071989918);
        setIntField(term247154, term247154.getClass(), "lastSelectTicket", -1383632524);
        setIntField(term247154, term247154.getClass(), "lastSelectCourse", 1357437054);
        setIntField(term247154, term247154.getClass(), "lastCountCourse", -1042866729);
        setField(term247154, term247154.getClass(), "firstGameId", "goQZKOBhTr");
        setField(term247154, term247154.getClass(), "firstRomVersion", "eaDGkLMDMl");
        setField(term247154, term247154.getClass(), "firstDataVersion", "dfvKtdkmjZ");
        setField(term247154, term247154.getClass(), "firstPlayDate", "XOFlovlfIj");
        setField(term247154, term247154.getClass(), "compatibleCmVersion", "gdTreEAwDY");
        setField(term247154, term247154.getClass(), "dailyBonusDate", "JEuvsJnhAW");
        setField(term247154, term247154.getClass(), "dailyCourseBonusDate", "qrIWqPjdov");
        setField(term247154, term247154.getClass(), "lastPairLoginDate", "chPkouOrOD");
        setField(term247154, term247154.getClass(), "lastTrialPlayDate", "VKPVssVIga");
        setIntField(term247154, term247154.getClass(), "playVsCount", 65417356);
        setIntField(term247154, term247154.getClass(), "playSyncCount", 1998186352);
        setIntField(term247154, term247154.getClass(), "winCount", 1778792634);
        setIntField(term247154, term247154.getClass(), "helpCount", -477162164);
        setIntField(term247154, term247154.getClass(), "comboCount", -1397399586);
        setLongField(term247154, term247154.getClass(), "totalDeluxscore", -8821230925120968379L);
        setLongField(term247154, term247154.getClass(), "totalBasicDeluxscore", -1650399504002551176L);
        setLongField(term247154, term247154.getClass(), "totalAdvancedDeluxscore", 7734375040858265011L);
        setLongField(term247154, term247154.getClass(), "totalExpertDeluxscore", 2812254788428165456L);
        setLongField(term247154, term247154.getClass(), "totalMasterDeluxscore", -4224144508839133515L);
        setLongField(term247154, term247154.getClass(), "totalReMasterDeluxscore", 8856488457240145572L);
        setIntField(term247154, term247154.getClass(), "totalSync", -1933029024);
        setIntField(term247154, term247154.getClass(), "totalBasicSync", 954573287);
        setIntField(term247154, term247154.getClass(), "totalAdvancedSync", 1974486967);
        setIntField(term247154, term247154.getClass(), "totalExpertSync", -1788451389);
        setIntField(term247154, term247154.getClass(), "totalMasterSync", -1198136820);
        setIntField(term247154, term247154.getClass(), "totalReMasterSync", 981813742);
        setLongField(term247154, term247154.getClass(), "totalAchievement", -5877196172319571618L);
        setLongField(term247154, term247154.getClass(), "totalBasicAchievement", -3352307422764396158L);
        setLongField(term247154, term247154.getClass(), "totalAdvancedAchievement", -4518293857308776760L);
        setLongField(term247154, term247154.getClass(), "totalExpertAchievement", -1153627645527650808L);
        setLongField(term247154, term247154.getClass(), "totalMasterAchievement", 2341193937000527412L);
        setLongField(term247154, term247154.getClass(), "totalReMasterAchievement", -4124169065087009241L);
        setLongField(term247154, term247154.getClass(), "playerOldRating", 6480775153663346038L);
        setLongField(term247154, term247154.getClass(), "playerNewRating", -1343518427891203414L);
        setIntField(term247154, term247154.getClass(), "banState", 949470328);
        setLongField(term247154, term247154.getClass(), "dateTime", 968043942193261455L);
        term247505 = new Integer(-1848906931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term247505;
        callMethod(klass, "setHighestRating", argTypes, term247154, args);
    }

};


