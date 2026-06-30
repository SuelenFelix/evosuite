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

public class UserAct_getParam3_7816392818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4578;

    public UserAct_getParam3_7816392818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4584 = new Long(-7237588299778557629L);
        ArrayList term4645 = new ArrayList();
        Integer term4651 = new Integer(97029295);
        Integer term4653 = new Integer(-1371869594);
        ArrayList term4649 = new ArrayList();
        ((ArrayList) term4649).add(term4651);
        ((ArrayList) term4649).add(term4653);
        term4578 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term4580 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4582 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4599 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4603 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4613 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4578, term4578.getClass(), "id", -1539859611880912454L);
        setLongField(term4580, term4580.getClass(), "id", 4100236067313034103L);
        setLongField(term4582, term4582.getClass(), "id", 1195529027276497124L);
        setField(term4582, term4582.getClass(), "extId", term4584);
        setField(term4582, term4582.getClass(), "luid", "OYbzXylRWW");
        setIntField(term4599, term4599.getClass(), "year", 2015);
        setShortField(term4599, term4599.getClass(), "month", (short) 9);
        setShortField(term4599, term4599.getClass(), "day", (short) 16);
        setField(term4598, term4598.getClass(), "date", term4599);
        setByteField(term4603, term4603.getClass(), "hour", (byte) 6);
        setByteField(term4603, term4603.getClass(), "minute", (byte) 19);
        setByteField(term4603, term4603.getClass(), "second", (byte) 42);
        setIntField(term4603, term4603.getClass(), "nano", 630084975);
        setField(term4598, term4598.getClass(), "time", term4603);
        setField(term4582, term4582.getClass(), "registerTime", term4598);
        setIntField(term4609, term4609.getClass(), "year", 2029);
        setShortField(term4609, term4609.getClass(), "month", (short) 6);
        setShortField(term4609, term4609.getClass(), "day", (short) 23);
        setField(term4608, term4608.getClass(), "date", term4609);
        setByteField(term4613, term4613.getClass(), "hour", (byte) 21);
        setByteField(term4613, term4613.getClass(), "minute", (byte) 55);
        setByteField(term4613, term4613.getClass(), "second", (byte) 27);
        setIntField(term4613, term4613.getClass(), "nano", 66889274);
        setField(term4608, term4608.getClass(), "time", term4613);
        setField(term4582, term4582.getClass(), "accessTime", term4608);
        setField(term4580, term4580.getClass(), "card", term4582);
        setField(term4580, term4580.getClass(), "userName", "DSNsTGYXDF");
        setIntField(term4580, term4580.getClass(), "isNetMember", 1074848808);
        setIntField(term4580, term4580.getClass(), "iconId", -146054762);
        setIntField(term4580, term4580.getClass(), "plateId", 798043553);
        setIntField(term4580, term4580.getClass(), "titleId", 533197381);
        setIntField(term4580, term4580.getClass(), "partnerId", 1048271679);
        setIntField(term4580, term4580.getClass(), "frameId", -1529797673);
        setIntField(term4580, term4580.getClass(), "selectMapId", -868676396);
        setIntField(term4580, term4580.getClass(), "totalAwake", 1922684808);
        setIntField(term4580, term4580.getClass(), "gradeRating", -2005784375);
        setIntField(term4580, term4580.getClass(), "musicRating", -288604325);
        setIntField(term4580, term4580.getClass(), "playerRating", -1268314569);
        setIntField(term4580, term4580.getClass(), "highestRating", 877649659);
        setIntField(term4580, term4580.getClass(), "gradeRank", -1332748804);
        setIntField(term4580, term4580.getClass(), "classRank", 1774507971);
        setIntField(term4580, term4580.getClass(), "courseRank", -1420269858);
        setField(term4580, term4580.getClass(), "charaSlot", term4645);
        setField(term4580, term4580.getClass(), "charaLockSlot", term4649);
        setLongField(term4580, term4580.getClass(), "contentBit", -2783999800714825789L);
        setIntField(term4580, term4580.getClass(), "playCount", -2119545015);
        setField(term4580, term4580.getClass(), "eventWatchedDate", "sQvGcVjdEx");
        setField(term4580, term4580.getClass(), "lastGameId", "rLHAoqXgPh");
        setField(term4580, term4580.getClass(), "lastRomVersion", "zUlRdimJtU");
        setField(term4580, term4580.getClass(), "lastDataVersion", "vwbEQQNQrx");
        setField(term4580, term4580.getClass(), "lastLoginDate", "xtftXXMbem");
        setField(term4580, term4580.getClass(), "lastPlayDate", "cudZvLMQon");
        setIntField(term4580, term4580.getClass(), "lastPlayCredit", 1272542218);
        setIntField(term4580, term4580.getClass(), "lastPlayMode", 1209799204);
        setIntField(term4580, term4580.getClass(), "lastPlaceId", 1094107751);
        setField(term4580, term4580.getClass(), "lastPlaceName", "lihXWlGDxk");
        setIntField(term4580, term4580.getClass(), "lastAllNetId", 844222656);
        setIntField(term4580, term4580.getClass(), "lastRegionId", -18216811);
        setField(term4580, term4580.getClass(), "lastRegionName", "JmcmxoGhIK");
        setField(term4580, term4580.getClass(), "lastClientId", "jXzmYyrnnT");
        setField(term4580, term4580.getClass(), "lastCountryCode", "igCAtimmYB");
        setIntField(term4580, term4580.getClass(), "lastSelectEMoney", -1813280137);
        setIntField(term4580, term4580.getClass(), "lastSelectTicket", 719656595);
        setIntField(term4580, term4580.getClass(), "lastSelectCourse", -1516995753);
        setIntField(term4580, term4580.getClass(), "lastCountCourse", -390501023);
        setField(term4580, term4580.getClass(), "firstGameId", "DyiXbeYIaN");
        setField(term4580, term4580.getClass(), "firstRomVersion", "VGizxZnyHX");
        setField(term4580, term4580.getClass(), "firstDataVersion", "kVEZMHmRtR");
        setField(term4580, term4580.getClass(), "firstPlayDate", "ekxGuOYIwi");
        setField(term4580, term4580.getClass(), "compatibleCmVersion", "RbVQXSpxXy");
        setField(term4580, term4580.getClass(), "dailyBonusDate", "YpJbIgJWWv");
        setField(term4580, term4580.getClass(), "dailyCourseBonusDate", "JppkknKVOw");
        setField(term4580, term4580.getClass(), "lastPairLoginDate", "iljANwuEjk");
        setField(term4580, term4580.getClass(), "lastTrialPlayDate", "kNqaJKIATy");
        setIntField(term4580, term4580.getClass(), "playVsCount", -1667482829);
        setIntField(term4580, term4580.getClass(), "playSyncCount", 1116576792);
        setIntField(term4580, term4580.getClass(), "winCount", -942194446);
        setIntField(term4580, term4580.getClass(), "helpCount", -938508470);
        setIntField(term4580, term4580.getClass(), "comboCount", 1242676024);
        setLongField(term4580, term4580.getClass(), "totalDeluxscore", 4266570509071948633L);
        setLongField(term4580, term4580.getClass(), "totalBasicDeluxscore", -7291742736502427077L);
        setLongField(term4580, term4580.getClass(), "totalAdvancedDeluxscore", -8121849829073967555L);
        setLongField(term4580, term4580.getClass(), "totalExpertDeluxscore", 5219030281405653303L);
        setLongField(term4580, term4580.getClass(), "totalMasterDeluxscore", -8471550651709805183L);
        setLongField(term4580, term4580.getClass(), "totalReMasterDeluxscore", -948292411727204525L);
        setIntField(term4580, term4580.getClass(), "totalSync", -1865023308);
        setIntField(term4580, term4580.getClass(), "totalBasicSync", 1698510819);
        setIntField(term4580, term4580.getClass(), "totalAdvancedSync", -1553893255);
        setIntField(term4580, term4580.getClass(), "totalExpertSync", 1303442927);
        setIntField(term4580, term4580.getClass(), "totalMasterSync", 794568325);
        setIntField(term4580, term4580.getClass(), "totalReMasterSync", -434468428);
        setLongField(term4580, term4580.getClass(), "totalAchievement", -8892586408602479513L);
        setLongField(term4580, term4580.getClass(), "totalBasicAchievement", 4616440478358528406L);
        setLongField(term4580, term4580.getClass(), "totalAdvancedAchievement", 3427570961451840069L);
        setLongField(term4580, term4580.getClass(), "totalExpertAchievement", 4502292577098212311L);
        setLongField(term4580, term4580.getClass(), "totalMasterAchievement", -3730936709704460408L);
        setLongField(term4580, term4580.getClass(), "totalReMasterAchievement", -8614778293741404325L);
        setLongField(term4580, term4580.getClass(), "playerOldRating", -5447369594017685765L);
        setLongField(term4580, term4580.getClass(), "playerNewRating", -5724112525188606013L);
        setIntField(term4580, term4580.getClass(), "banState", 1559605714);
        setLongField(term4580, term4580.getClass(), "dateTime", -6100012593724108983L);
        setField(term4578, term4578.getClass(), "user", term4580);
        setIntField(term4578, term4578.getClass(), "kind", 1146601902);
        setIntField(term4578, term4578.getClass(), "activityId", -1938881385);
        setLongField(term4578, term4578.getClass(), "sortNumber", 5465527210299101732L);
        setIntField(term4578, term4578.getClass(), "param1", -1629418973);
        setIntField(term4578, term4578.getClass(), "param2", -100825168);
        setIntField(term4578, term4578.getClass(), "param3", 768407648);
        setIntField(term4578, term4578.getClass(), "param4", -350454594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam3", argTypes, term4578, args);
    }

};


