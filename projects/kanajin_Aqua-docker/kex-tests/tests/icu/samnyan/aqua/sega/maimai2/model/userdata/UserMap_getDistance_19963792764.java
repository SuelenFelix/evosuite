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

public class UserMap_getDistance_19963792764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575520;

    public UserMap_getDistance_19963792764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term575526 = new Long(7930227263182470549L);
        Integer term575589 = new Integer(1470124459);
        Integer term575591 = new Integer(1708162324);
        Integer term575593 = new Integer(686279974);
        ArrayList term575587 = new ArrayList();
        ((ArrayList) term575587).add(term575589);
        ((ArrayList) term575587).add(term575591);
        ((ArrayList) term575587).add(term575593);
        Integer term575599 = new Integer(2022250483);
        Integer term575601 = new Integer(509321963);
        Integer term575603 = new Integer(-2063187052);
        Integer term575605 = new Integer(133581490);
        Integer term575607 = new Integer(-579671719);
        Integer term575609 = new Integer(-1915340015);
        ArrayList term575597 = new ArrayList();
        ((ArrayList) term575597).add(term575599);
        ((ArrayList) term575597).add(term575601);
        ((ArrayList) term575597).add(term575603);
        ((ArrayList) term575597).add(term575605);
        ((ArrayList) term575597).add(term575607);
        ((ArrayList) term575597).add(term575609);
        term575520 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term575522 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term575524 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term575540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term575541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term575545 = newInstance(Class.forName("java.time.LocalTime"));
        Object term575550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term575551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term575555 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term575520, term575520.getClass(), "id", -5396026109499565265L);
        setLongField(term575522, term575522.getClass(), "id", -521385106719230458L);
        setLongField(term575524, term575524.getClass(), "id", -1654083207272420039L);
        setField(term575524, term575524.getClass(), "extId", term575526);
        setField(term575524, term575524.getClass(), "luid", "BLtOQceajB");
        setIntField(term575541, term575541.getClass(), "year", 2011);
        setShortField(term575541, term575541.getClass(), "month", (short) 11);
        setShortField(term575541, term575541.getClass(), "day", (short) 9);
        setField(term575540, term575540.getClass(), "date", term575541);
        setByteField(term575545, term575545.getClass(), "hour", (byte) 6);
        setByteField(term575545, term575545.getClass(), "minute", (byte) 48);
        setByteField(term575545, term575545.getClass(), "second", (byte) 47);
        setIntField(term575545, term575545.getClass(), "nano", 436444004);
        setField(term575540, term575540.getClass(), "time", term575545);
        setField(term575524, term575524.getClass(), "registerTime", term575540);
        setIntField(term575551, term575551.getClass(), "year", 2014);
        setShortField(term575551, term575551.getClass(), "month", (short) 9);
        setShortField(term575551, term575551.getClass(), "day", (short) 28);
        setField(term575550, term575550.getClass(), "date", term575551);
        setByteField(term575555, term575555.getClass(), "hour", (byte) 8);
        setByteField(term575555, term575555.getClass(), "minute", (byte) 21);
        setByteField(term575555, term575555.getClass(), "second", (byte) 26);
        setIntField(term575555, term575555.getClass(), "nano", 350960816);
        setField(term575550, term575550.getClass(), "time", term575555);
        setField(term575524, term575524.getClass(), "accessTime", term575550);
        setField(term575522, term575522.getClass(), "card", term575524);
        setField(term575522, term575522.getClass(), "userName", "AvkclCGRIM");
        setIntField(term575522, term575522.getClass(), "isNetMember", 1058669410);
        setIntField(term575522, term575522.getClass(), "iconId", 1136033306);
        setIntField(term575522, term575522.getClass(), "plateId", -2132247486);
        setIntField(term575522, term575522.getClass(), "titleId", 1761556464);
        setIntField(term575522, term575522.getClass(), "partnerId", 1202837216);
        setIntField(term575522, term575522.getClass(), "frameId", 1999186828);
        setIntField(term575522, term575522.getClass(), "selectMapId", -6778929);
        setIntField(term575522, term575522.getClass(), "totalAwake", 1204160671);
        setIntField(term575522, term575522.getClass(), "gradeRating", -489882058);
        setIntField(term575522, term575522.getClass(), "musicRating", 1768709781);
        setIntField(term575522, term575522.getClass(), "playerRating", -359838523);
        setIntField(term575522, term575522.getClass(), "highestRating", -162038215);
        setIntField(term575522, term575522.getClass(), "gradeRank", -711438866);
        setIntField(term575522, term575522.getClass(), "classRank", 1003953145);
        setIntField(term575522, term575522.getClass(), "courseRank", 1672267725);
        setField(term575522, term575522.getClass(), "charaSlot", term575587);
        setField(term575522, term575522.getClass(), "charaLockSlot", term575597);
        setLongField(term575522, term575522.getClass(), "contentBit", -303817027705193455L);
        setIntField(term575522, term575522.getClass(), "playCount", 157006631);
        setField(term575522, term575522.getClass(), "eventWatchedDate", "pasmArqJcc");
        setField(term575522, term575522.getClass(), "lastGameId", "ORziXqRUcy");
        setField(term575522, term575522.getClass(), "lastRomVersion", "NOjuHdQFXv");
        setField(term575522, term575522.getClass(), "lastDataVersion", "hbpquEOwQz");
        setField(term575522, term575522.getClass(), "lastLoginDate", "gJYCnwhwJR");
        setField(term575522, term575522.getClass(), "lastPlayDate", "SCocntOfUJ");
        setIntField(term575522, term575522.getClass(), "lastPlayCredit", -2093846954);
        setIntField(term575522, term575522.getClass(), "lastPlayMode", 2123044786);
        setIntField(term575522, term575522.getClass(), "lastPlaceId", -987068735);
        setField(term575522, term575522.getClass(), "lastPlaceName", "GmFWGMFvof");
        setIntField(term575522, term575522.getClass(), "lastAllNetId", -1771252952);
        setIntField(term575522, term575522.getClass(), "lastRegionId", -92197538);
        setField(term575522, term575522.getClass(), "lastRegionName", "BHrdLFqdcl");
        setField(term575522, term575522.getClass(), "lastClientId", "kFsadCmjxv");
        setField(term575522, term575522.getClass(), "lastCountryCode", "EdfnVSIoFX");
        setIntField(term575522, term575522.getClass(), "lastSelectEMoney", -234132733);
        setIntField(term575522, term575522.getClass(), "lastSelectTicket", -1464271065);
        setIntField(term575522, term575522.getClass(), "lastSelectCourse", -712752759);
        setIntField(term575522, term575522.getClass(), "lastCountCourse", 435129030);
        setField(term575522, term575522.getClass(), "firstGameId", "KZeJHgVfvz");
        setField(term575522, term575522.getClass(), "firstRomVersion", "BZHysMocbt");
        setField(term575522, term575522.getClass(), "firstDataVersion", "kLlFwVPzTu");
        setField(term575522, term575522.getClass(), "firstPlayDate", "ntjpLBCrGm");
        setField(term575522, term575522.getClass(), "compatibleCmVersion", "MPeQAHFqRo");
        setField(term575522, term575522.getClass(), "dailyBonusDate", "ZcLAGhPdcF");
        setField(term575522, term575522.getClass(), "dailyCourseBonusDate", "IzPEwEYyvQ");
        setField(term575522, term575522.getClass(), "lastPairLoginDate", "pAqrAWVXkv");
        setField(term575522, term575522.getClass(), "lastTrialPlayDate", "vTOdbWAycn");
        setIntField(term575522, term575522.getClass(), "playVsCount", -415230003);
        setIntField(term575522, term575522.getClass(), "playSyncCount", -629802757);
        setIntField(term575522, term575522.getClass(), "winCount", -183693677);
        setIntField(term575522, term575522.getClass(), "helpCount", 1203626616);
        setIntField(term575522, term575522.getClass(), "comboCount", -1948390112);
        setLongField(term575522, term575522.getClass(), "totalDeluxscore", -5302589692879534619L);
        setLongField(term575522, term575522.getClass(), "totalBasicDeluxscore", 3545004280836447292L);
        setLongField(term575522, term575522.getClass(), "totalAdvancedDeluxscore", 5540656257401057815L);
        setLongField(term575522, term575522.getClass(), "totalExpertDeluxscore", 3040047951379340219L);
        setLongField(term575522, term575522.getClass(), "totalMasterDeluxscore", -5799610016736539471L);
        setLongField(term575522, term575522.getClass(), "totalReMasterDeluxscore", -4323952097254784541L);
        setIntField(term575522, term575522.getClass(), "totalSync", 1223940528);
        setIntField(term575522, term575522.getClass(), "totalBasicSync", 1190025283);
        setIntField(term575522, term575522.getClass(), "totalAdvancedSync", 876599602);
        setIntField(term575522, term575522.getClass(), "totalExpertSync", -1601199851);
        setIntField(term575522, term575522.getClass(), "totalMasterSync", 694033273);
        setIntField(term575522, term575522.getClass(), "totalReMasterSync", 1374237248);
        setLongField(term575522, term575522.getClass(), "totalAchievement", 4652436695689460720L);
        setLongField(term575522, term575522.getClass(), "totalBasicAchievement", -2952430683228770765L);
        setLongField(term575522, term575522.getClass(), "totalAdvancedAchievement", 7023635750708027669L);
        setLongField(term575522, term575522.getClass(), "totalExpertAchievement", 904086364267186840L);
        setLongField(term575522, term575522.getClass(), "totalMasterAchievement", -350752318994473401L);
        setLongField(term575522, term575522.getClass(), "totalReMasterAchievement", 4926292950415482348L);
        setLongField(term575522, term575522.getClass(), "playerOldRating", 4347897726676457143L);
        setLongField(term575522, term575522.getClass(), "playerNewRating", 6299881604447388352L);
        setIntField(term575522, term575522.getClass(), "banState", -1560678553);
        setLongField(term575522, term575522.getClass(), "dateTime", -823313455125902075L);
        setField(term575520, term575520.getClass(), "user", term575522);
        setIntField(term575520, term575520.getClass(), "mapId", -826919974);
        setIntField(term575520, term575520.getClass(), "distance", 30897348);
        setBooleanField(term575520, term575520.getClass(), "isLock", true);
        setBooleanField(term575520, term575520.getClass(), "isClear", true);
        setBooleanField(term575520, term575520.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDistance", argTypes, term575520, args);
    }

};


