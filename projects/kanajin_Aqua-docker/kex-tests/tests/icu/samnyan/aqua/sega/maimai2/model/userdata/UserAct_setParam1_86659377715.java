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

public class UserAct_setParam1_86659377715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9183;
     Object term9545;

    public UserAct_setParam1_86659377715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9189 = new Long(-316468845751588286L);
        Integer term9252 = new Integer(96566506);
        Integer term9254 = new Integer(-343325701);
        ArrayList term9250 = new ArrayList();
        ((ArrayList) term9250).add(term9252);
        ((ArrayList) term9250).add(term9254);
        Integer term9260 = new Integer(107945604);
        Integer term9262 = new Integer(-1963464809);
        Integer term9264 = new Integer(71190297);
        Integer term9266 = new Integer(1202361360);
        Integer term9268 = new Integer(-2015048153);
        ArrayList term9258 = new ArrayList();
        ((ArrayList) term9258).add(term9260);
        ((ArrayList) term9258).add(term9262);
        ((ArrayList) term9258).add(term9264);
        ((ArrayList) term9258).add(term9266);
        ((ArrayList) term9258).add(term9268);
        term9183 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term9185 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term9187 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term9203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9218 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term9183, term9183.getClass(), "id", -532956263280568707L);
        setLongField(term9185, term9185.getClass(), "id", 6073193746616629086L);
        setLongField(term9187, term9187.getClass(), "id", -2463629530824341661L);
        setField(term9187, term9187.getClass(), "extId", term9189);
        setField(term9187, term9187.getClass(), "luid", "RCOqfVsRHt");
        setIntField(term9204, term9204.getClass(), "year", 2012);
        setShortField(term9204, term9204.getClass(), "month", (short) 3);
        setShortField(term9204, term9204.getClass(), "day", (short) 27);
        setField(term9203, term9203.getClass(), "date", term9204);
        setByteField(term9208, term9208.getClass(), "hour", (byte) 17);
        setByteField(term9208, term9208.getClass(), "minute", (byte) 49);
        setByteField(term9208, term9208.getClass(), "second", (byte) 24);
        setIntField(term9208, term9208.getClass(), "nano", 530647398);
        setField(term9203, term9203.getClass(), "time", term9208);
        setField(term9187, term9187.getClass(), "registerTime", term9203);
        setIntField(term9214, term9214.getClass(), "year", 2010);
        setShortField(term9214, term9214.getClass(), "month", (short) 6);
        setShortField(term9214, term9214.getClass(), "day", (short) 14);
        setField(term9213, term9213.getClass(), "date", term9214);
        setByteField(term9218, term9218.getClass(), "hour", (byte) 6);
        setByteField(term9218, term9218.getClass(), "minute", (byte) 22);
        setByteField(term9218, term9218.getClass(), "second", (byte) 20);
        setIntField(term9218, term9218.getClass(), "nano", 25133051);
        setField(term9213, term9213.getClass(), "time", term9218);
        setField(term9187, term9187.getClass(), "accessTime", term9213);
        setField(term9185, term9185.getClass(), "card", term9187);
        setField(term9185, term9185.getClass(), "userName", "TSyCeEZPaT");
        setIntField(term9185, term9185.getClass(), "isNetMember", -497534255);
        setIntField(term9185, term9185.getClass(), "iconId", 1588942911);
        setIntField(term9185, term9185.getClass(), "plateId", -2129828854);
        setIntField(term9185, term9185.getClass(), "titleId", -47438786);
        setIntField(term9185, term9185.getClass(), "partnerId", -1955400589);
        setIntField(term9185, term9185.getClass(), "frameId", 626179200);
        setIntField(term9185, term9185.getClass(), "selectMapId", -511077684);
        setIntField(term9185, term9185.getClass(), "totalAwake", -711507760);
        setIntField(term9185, term9185.getClass(), "gradeRating", 1053773809);
        setIntField(term9185, term9185.getClass(), "musicRating", 924127883);
        setIntField(term9185, term9185.getClass(), "playerRating", -751079123);
        setIntField(term9185, term9185.getClass(), "highestRating", -110837188);
        setIntField(term9185, term9185.getClass(), "gradeRank", -271094506);
        setIntField(term9185, term9185.getClass(), "classRank", 455632030);
        setIntField(term9185, term9185.getClass(), "courseRank", -1632929393);
        setField(term9185, term9185.getClass(), "charaSlot", term9250);
        setField(term9185, term9185.getClass(), "charaLockSlot", term9258);
        setLongField(term9185, term9185.getClass(), "contentBit", 7800835025296877231L);
        setIntField(term9185, term9185.getClass(), "playCount", -431440129);
        setField(term9185, term9185.getClass(), "eventWatchedDate", "JeZFtaqkzW");
        setField(term9185, term9185.getClass(), "lastGameId", "vOVuNSCCLe");
        setField(term9185, term9185.getClass(), "lastRomVersion", "fzeqPnzpnt");
        setField(term9185, term9185.getClass(), "lastDataVersion", "RxbhrFBjkO");
        setField(term9185, term9185.getClass(), "lastLoginDate", "aanyiAOJCl");
        setField(term9185, term9185.getClass(), "lastPlayDate", "VDokbsCuqq");
        setIntField(term9185, term9185.getClass(), "lastPlayCredit", -763576148);
        setIntField(term9185, term9185.getClass(), "lastPlayMode", 1568948514);
        setIntField(term9185, term9185.getClass(), "lastPlaceId", -1511130237);
        setField(term9185, term9185.getClass(), "lastPlaceName", "xClUIcPECX");
        setIntField(term9185, term9185.getClass(), "lastAllNetId", 452088587);
        setIntField(term9185, term9185.getClass(), "lastRegionId", -1630069454);
        setField(term9185, term9185.getClass(), "lastRegionName", "avhRaGZaBF");
        setField(term9185, term9185.getClass(), "lastClientId", "JkgoRtImdE");
        setField(term9185, term9185.getClass(), "lastCountryCode", "qFGKIJjlmV");
        setIntField(term9185, term9185.getClass(), "lastSelectEMoney", 1499735894);
        setIntField(term9185, term9185.getClass(), "lastSelectTicket", 716486048);
        setIntField(term9185, term9185.getClass(), "lastSelectCourse", -466708718);
        setIntField(term9185, term9185.getClass(), "lastCountCourse", 1038029515);
        setField(term9185, term9185.getClass(), "firstGameId", "IHqvyhMtuM");
        setField(term9185, term9185.getClass(), "firstRomVersion", "dAldIGYAXV");
        setField(term9185, term9185.getClass(), "firstDataVersion", "mLwibAPEsa");
        setField(term9185, term9185.getClass(), "firstPlayDate", "zsWKWiTFuo");
        setField(term9185, term9185.getClass(), "compatibleCmVersion", "UPUbwyHQKN");
        setField(term9185, term9185.getClass(), "dailyBonusDate", "lgQkrXANyI");
        setField(term9185, term9185.getClass(), "dailyCourseBonusDate", "MeTmRZXErV");
        setField(term9185, term9185.getClass(), "lastPairLoginDate", "jNxbVmoZgq");
        setField(term9185, term9185.getClass(), "lastTrialPlayDate", "PvmBHIXaMY");
        setIntField(term9185, term9185.getClass(), "playVsCount", 1137154606);
        setIntField(term9185, term9185.getClass(), "playSyncCount", -100681578);
        setIntField(term9185, term9185.getClass(), "winCount", 296568835);
        setIntField(term9185, term9185.getClass(), "helpCount", 1431951992);
        setIntField(term9185, term9185.getClass(), "comboCount", -1608123016);
        setLongField(term9185, term9185.getClass(), "totalDeluxscore", -187772971269812453L);
        setLongField(term9185, term9185.getClass(), "totalBasicDeluxscore", 468487103823886117L);
        setLongField(term9185, term9185.getClass(), "totalAdvancedDeluxscore", 4139034517298316285L);
        setLongField(term9185, term9185.getClass(), "totalExpertDeluxscore", 5797412846146719084L);
        setLongField(term9185, term9185.getClass(), "totalMasterDeluxscore", 5319740127125920367L);
        setLongField(term9185, term9185.getClass(), "totalReMasterDeluxscore", 6465987664600701876L);
        setIntField(term9185, term9185.getClass(), "totalSync", -896473214);
        setIntField(term9185, term9185.getClass(), "totalBasicSync", 401203924);
        setIntField(term9185, term9185.getClass(), "totalAdvancedSync", -1212399479);
        setIntField(term9185, term9185.getClass(), "totalExpertSync", 2107679041);
        setIntField(term9185, term9185.getClass(), "totalMasterSync", 2040965507);
        setIntField(term9185, term9185.getClass(), "totalReMasterSync", -1281083262);
        setLongField(term9185, term9185.getClass(), "totalAchievement", -136372844051852955L);
        setLongField(term9185, term9185.getClass(), "totalBasicAchievement", -7632759764262745126L);
        setLongField(term9185, term9185.getClass(), "totalAdvancedAchievement", 3746481521207337771L);
        setLongField(term9185, term9185.getClass(), "totalExpertAchievement", 4341016500855678917L);
        setLongField(term9185, term9185.getClass(), "totalMasterAchievement", -5871746020807491998L);
        setLongField(term9185, term9185.getClass(), "totalReMasterAchievement", 4742108233936970770L);
        setLongField(term9185, term9185.getClass(), "playerOldRating", 2722004046017350471L);
        setLongField(term9185, term9185.getClass(), "playerNewRating", 6636235983121346803L);
        setIntField(term9185, term9185.getClass(), "banState", 1059930704);
        setLongField(term9185, term9185.getClass(), "dateTime", 146749226579788091L);
        setField(term9183, term9183.getClass(), "user", term9185);
        setIntField(term9183, term9183.getClass(), "kind", -1967153290);
        setIntField(term9183, term9183.getClass(), "activityId", -1397251956);
        setLongField(term9183, term9183.getClass(), "sortNumber", -1279670138064751276L);
        setIntField(term9183, term9183.getClass(), "param1", -796934571);
        setIntField(term9183, term9183.getClass(), "param2", 405295896);
        setIntField(term9183, term9183.getClass(), "param3", -814977075);
        setIntField(term9183, term9183.getClass(), "param4", 808614267);
        term9545 = new Integer(1611734632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9545;
        callMethod(klass, "setParam1", argTypes, term9183, args);
    }

};


