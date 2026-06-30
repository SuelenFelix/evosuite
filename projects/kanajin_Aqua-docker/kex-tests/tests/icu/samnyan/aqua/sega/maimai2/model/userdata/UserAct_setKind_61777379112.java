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

public class UserAct_setKind_61777379112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7445;
     Object term7809;

    public UserAct_setKind_61777379112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7451 = new Long(2535595959091595249L);
        Integer term7514 = new Integer(1596213415);
        Integer term7516 = new Integer(-268815336);
        Integer term7518 = new Integer(-1210583429);
        Integer term7520 = new Integer(-663691365);
        Integer term7522 = new Integer(339854490);
        ArrayList term7512 = new ArrayList();
        ((ArrayList) term7512).add(term7514);
        ((ArrayList) term7512).add(term7516);
        ((ArrayList) term7512).add(term7518);
        ((ArrayList) term7512).add(term7520);
        ((ArrayList) term7512).add(term7522);
        Integer term7528 = new Integer(-615654495);
        Integer term7530 = new Integer(-1476117762);
        Integer term7532 = new Integer(-341962980);
        ArrayList term7526 = new ArrayList();
        ((ArrayList) term7526).add(term7528);
        ((ArrayList) term7526).add(term7530);
        ((ArrayList) term7526).add(term7532);
        term7445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term7447 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term7449 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term7465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7470 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7480 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7445, term7445.getClass(), "id", 5184635470881147510L);
        setLongField(term7447, term7447.getClass(), "id", 918397384129253729L);
        setLongField(term7449, term7449.getClass(), "id", -2187638136407967948L);
        setField(term7449, term7449.getClass(), "extId", term7451);
        setField(term7449, term7449.getClass(), "luid", "NHbOFFjyVK");
        setIntField(term7466, term7466.getClass(), "year", 2028);
        setShortField(term7466, term7466.getClass(), "month", (short) 10);
        setShortField(term7466, term7466.getClass(), "day", (short) 1);
        setField(term7465, term7465.getClass(), "date", term7466);
        setByteField(term7470, term7470.getClass(), "hour", (byte) 17);
        setByteField(term7470, term7470.getClass(), "minute", (byte) 29);
        setByteField(term7470, term7470.getClass(), "second", (byte) 30);
        setIntField(term7470, term7470.getClass(), "nano", 845472306);
        setField(term7465, term7465.getClass(), "time", term7470);
        setField(term7449, term7449.getClass(), "registerTime", term7465);
        setIntField(term7476, term7476.getClass(), "year", 2027);
        setShortField(term7476, term7476.getClass(), "month", (short) 2);
        setShortField(term7476, term7476.getClass(), "day", (short) 19);
        setField(term7475, term7475.getClass(), "date", term7476);
        setByteField(term7480, term7480.getClass(), "hour", (byte) 17);
        setByteField(term7480, term7480.getClass(), "minute", (byte) 37);
        setByteField(term7480, term7480.getClass(), "second", (byte) 27);
        setIntField(term7480, term7480.getClass(), "nano", 920380537);
        setField(term7475, term7475.getClass(), "time", term7480);
        setField(term7449, term7449.getClass(), "accessTime", term7475);
        setField(term7447, term7447.getClass(), "card", term7449);
        setField(term7447, term7447.getClass(), "userName", "zaloBqlrSo");
        setIntField(term7447, term7447.getClass(), "isNetMember", 1136208236);
        setIntField(term7447, term7447.getClass(), "iconId", -1220630391);
        setIntField(term7447, term7447.getClass(), "plateId", -995822131);
        setIntField(term7447, term7447.getClass(), "titleId", -687282231);
        setIntField(term7447, term7447.getClass(), "partnerId", 1200440315);
        setIntField(term7447, term7447.getClass(), "frameId", 40571662);
        setIntField(term7447, term7447.getClass(), "selectMapId", 1863910269);
        setIntField(term7447, term7447.getClass(), "totalAwake", 864645689);
        setIntField(term7447, term7447.getClass(), "gradeRating", 279384872);
        setIntField(term7447, term7447.getClass(), "musicRating", 1427305953);
        setIntField(term7447, term7447.getClass(), "playerRating", -781832877);
        setIntField(term7447, term7447.getClass(), "highestRating", 797203987);
        setIntField(term7447, term7447.getClass(), "gradeRank", 1973060703);
        setIntField(term7447, term7447.getClass(), "classRank", -138239905);
        setIntField(term7447, term7447.getClass(), "courseRank", 1709474063);
        setField(term7447, term7447.getClass(), "charaSlot", term7512);
        setField(term7447, term7447.getClass(), "charaLockSlot", term7526);
        setLongField(term7447, term7447.getClass(), "contentBit", 8708846223293804408L);
        setIntField(term7447, term7447.getClass(), "playCount", 1406617209);
        setField(term7447, term7447.getClass(), "eventWatchedDate", "vvoLrMGCoN");
        setField(term7447, term7447.getClass(), "lastGameId", "pXdglvyrQe");
        setField(term7447, term7447.getClass(), "lastRomVersion", "OcfNzHYdki");
        setField(term7447, term7447.getClass(), "lastDataVersion", "uPuCVuZYOI");
        setField(term7447, term7447.getClass(), "lastLoginDate", "TweMFhxNdj");
        setField(term7447, term7447.getClass(), "lastPlayDate", "NBrvVzvQHe");
        setIntField(term7447, term7447.getClass(), "lastPlayCredit", 1706047059);
        setIntField(term7447, term7447.getClass(), "lastPlayMode", 590451710);
        setIntField(term7447, term7447.getClass(), "lastPlaceId", -1999787419);
        setField(term7447, term7447.getClass(), "lastPlaceName", "FjOiNAfBOc");
        setIntField(term7447, term7447.getClass(), "lastAllNetId", -1224443634);
        setIntField(term7447, term7447.getClass(), "lastRegionId", 1048451946);
        setField(term7447, term7447.getClass(), "lastRegionName", "iCCsaLHohG");
        setField(term7447, term7447.getClass(), "lastClientId", "NJhGgctbdj");
        setField(term7447, term7447.getClass(), "lastCountryCode", "MYWYUeLGOp");
        setIntField(term7447, term7447.getClass(), "lastSelectEMoney", 5603560);
        setIntField(term7447, term7447.getClass(), "lastSelectTicket", -1079020032);
        setIntField(term7447, term7447.getClass(), "lastSelectCourse", -1973791064);
        setIntField(term7447, term7447.getClass(), "lastCountCourse", -2072158633);
        setField(term7447, term7447.getClass(), "firstGameId", "tsTGdgQYUL");
        setField(term7447, term7447.getClass(), "firstRomVersion", "TtGbVmKcnX");
        setField(term7447, term7447.getClass(), "firstDataVersion", "GJVkUrCVdD");
        setField(term7447, term7447.getClass(), "firstPlayDate", "zNdorvdUgu");
        setField(term7447, term7447.getClass(), "compatibleCmVersion", "oPxuZbkYio");
        setField(term7447, term7447.getClass(), "dailyBonusDate", "vKitydDVnM");
        setField(term7447, term7447.getClass(), "dailyCourseBonusDate", "urCiQnUFBM");
        setField(term7447, term7447.getClass(), "lastPairLoginDate", "EKjQdtKxAM");
        setField(term7447, term7447.getClass(), "lastTrialPlayDate", "TXZAIPQJHt");
        setIntField(term7447, term7447.getClass(), "playVsCount", -355469363);
        setIntField(term7447, term7447.getClass(), "playSyncCount", 1465188553);
        setIntField(term7447, term7447.getClass(), "winCount", 1633913667);
        setIntField(term7447, term7447.getClass(), "helpCount", 1292332296);
        setIntField(term7447, term7447.getClass(), "comboCount", -1415256843);
        setLongField(term7447, term7447.getClass(), "totalDeluxscore", -2986201902216133814L);
        setLongField(term7447, term7447.getClass(), "totalBasicDeluxscore", 4255811647459029682L);
        setLongField(term7447, term7447.getClass(), "totalAdvancedDeluxscore", 8000844860910174690L);
        setLongField(term7447, term7447.getClass(), "totalExpertDeluxscore", 2209808079059619773L);
        setLongField(term7447, term7447.getClass(), "totalMasterDeluxscore", 8403492202041709902L);
        setLongField(term7447, term7447.getClass(), "totalReMasterDeluxscore", -113028659747841511L);
        setIntField(term7447, term7447.getClass(), "totalSync", 612177768);
        setIntField(term7447, term7447.getClass(), "totalBasicSync", -1626451656);
        setIntField(term7447, term7447.getClass(), "totalAdvancedSync", 173952451);
        setIntField(term7447, term7447.getClass(), "totalExpertSync", -1972033388);
        setIntField(term7447, term7447.getClass(), "totalMasterSync", -1005024758);
        setIntField(term7447, term7447.getClass(), "totalReMasterSync", 2634669);
        setLongField(term7447, term7447.getClass(), "totalAchievement", 7271112616766426991L);
        setLongField(term7447, term7447.getClass(), "totalBasicAchievement", -8514728180792822493L);
        setLongField(term7447, term7447.getClass(), "totalAdvancedAchievement", 5315236285592892506L);
        setLongField(term7447, term7447.getClass(), "totalExpertAchievement", -6969704322644192945L);
        setLongField(term7447, term7447.getClass(), "totalMasterAchievement", -6685235643232255177L);
        setLongField(term7447, term7447.getClass(), "totalReMasterAchievement", -5656664340499957324L);
        setLongField(term7447, term7447.getClass(), "playerOldRating", -5460517064177800852L);
        setLongField(term7447, term7447.getClass(), "playerNewRating", -5242567610844514867L);
        setIntField(term7447, term7447.getClass(), "banState", -1912429941);
        setLongField(term7447, term7447.getClass(), "dateTime", -2951854704066477061L);
        setField(term7445, term7445.getClass(), "user", term7447);
        setIntField(term7445, term7445.getClass(), "kind", 1801052257);
        setIntField(term7445, term7445.getClass(), "activityId", -2110556060);
        setLongField(term7445, term7445.getClass(), "sortNumber", 174253963298276221L);
        setIntField(term7445, term7445.getClass(), "param1", 313459791);
        setIntField(term7445, term7445.getClass(), "param2", 752615112);
        setIntField(term7445, term7445.getClass(), "param3", -1674430871);
        setIntField(term7445, term7445.getClass(), "param4", 794352120);
        term7809 = new Integer(340719678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7809;
        callMethod(klass, "setKind", argTypes, term7445, args);
    }

};


