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

public class UserDetail_setTotalMasterAchievement_426561655148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279856;
     Object term280215;

    public UserDetail_setTotalMasterAchievement_426561655148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term279860 = new Long(-8705953038984862378L);
        Integer term279923 = new Integer(1191665770);
        Integer term279925 = new Integer(-401274751);
        Integer term279927 = new Integer(2063937149);
        Integer term279929 = new Integer(166881458);
        Integer term279931 = new Integer(828853234);
        Integer term279933 = new Integer(1203278976);
        Integer term279935 = new Integer(751787241);
        ArrayList term279921 = new ArrayList();
        ((ArrayList) term279921).add(term279923);
        ((ArrayList) term279921).add(term279925);
        ((ArrayList) term279921).add(term279927);
        ((ArrayList) term279921).add(term279929);
        ((ArrayList) term279921).add(term279931);
        ((ArrayList) term279921).add(term279933);
        ((ArrayList) term279921).add(term279935);
        Integer term279941 = new Integer(477748320);
        Integer term279943 = new Integer(512793147);
        Integer term279945 = new Integer(-2061386860);
        ArrayList term279939 = new ArrayList();
        ((ArrayList) term279939).add(term279941);
        ((ArrayList) term279939).add(term279943);
        ((ArrayList) term279939).add(term279945);
        term279856 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term279858 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term279874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279879 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279884 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279885 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279889 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term279856, term279856.getClass(), "id", 2500873604963348111L);
        setLongField(term279858, term279858.getClass(), "id", 5217198968737211545L);
        setField(term279858, term279858.getClass(), "extId", term279860);
        setField(term279858, term279858.getClass(), "luid", "XRvQvyRaeI");
        setIntField(term279875, term279875.getClass(), "year", 2026);
        setShortField(term279875, term279875.getClass(), "month", (short) 3);
        setShortField(term279875, term279875.getClass(), "day", (short) 11);
        setField(term279874, term279874.getClass(), "date", term279875);
        setByteField(term279879, term279879.getClass(), "hour", (byte) 5);
        setByteField(term279879, term279879.getClass(), "minute", (byte) 28);
        setByteField(term279879, term279879.getClass(), "second", (byte) 38);
        setIntField(term279879, term279879.getClass(), "nano", 951846633);
        setField(term279874, term279874.getClass(), "time", term279879);
        setField(term279858, term279858.getClass(), "registerTime", term279874);
        setIntField(term279885, term279885.getClass(), "year", 2025);
        setShortField(term279885, term279885.getClass(), "month", (short) 3);
        setShortField(term279885, term279885.getClass(), "day", (short) 12);
        setField(term279884, term279884.getClass(), "date", term279885);
        setByteField(term279889, term279889.getClass(), "hour", (byte) 2);
        setByteField(term279889, term279889.getClass(), "minute", (byte) 17);
        setByteField(term279889, term279889.getClass(), "second", (byte) 13);
        setIntField(term279889, term279889.getClass(), "nano", 667967879);
        setField(term279884, term279884.getClass(), "time", term279889);
        setField(term279858, term279858.getClass(), "accessTime", term279884);
        setField(term279856, term279856.getClass(), "card", term279858);
        setField(term279856, term279856.getClass(), "userName", "PiiAJlvOam");
        setIntField(term279856, term279856.getClass(), "isNetMember", -1177568076);
        setIntField(term279856, term279856.getClass(), "iconId", 2119973929);
        setIntField(term279856, term279856.getClass(), "plateId", 617926596);
        setIntField(term279856, term279856.getClass(), "titleId", 1992438907);
        setIntField(term279856, term279856.getClass(), "partnerId", 428161876);
        setIntField(term279856, term279856.getClass(), "frameId", -265853482);
        setIntField(term279856, term279856.getClass(), "selectMapId", -1169211096);
        setIntField(term279856, term279856.getClass(), "totalAwake", 1551300037);
        setIntField(term279856, term279856.getClass(), "gradeRating", -1203470065);
        setIntField(term279856, term279856.getClass(), "musicRating", 1164893503);
        setIntField(term279856, term279856.getClass(), "playerRating", -1051326797);
        setIntField(term279856, term279856.getClass(), "highestRating", -694443859);
        setIntField(term279856, term279856.getClass(), "gradeRank", -1566825264);
        setIntField(term279856, term279856.getClass(), "classRank", 364041118);
        setIntField(term279856, term279856.getClass(), "courseRank", -1797543289);
        setField(term279856, term279856.getClass(), "charaSlot", term279921);
        setField(term279856, term279856.getClass(), "charaLockSlot", term279939);
        setLongField(term279856, term279856.getClass(), "contentBit", -3780966725992104975L);
        setIntField(term279856, term279856.getClass(), "playCount", -73122887);
        setField(term279856, term279856.getClass(), "eventWatchedDate", "siXyhYgybV");
        setField(term279856, term279856.getClass(), "lastGameId", "ZyNlPlXuvg");
        setField(term279856, term279856.getClass(), "lastRomVersion", "OXzFwGxUWY");
        setField(term279856, term279856.getClass(), "lastDataVersion", "hlYhjhXVeY");
        setField(term279856, term279856.getClass(), "lastLoginDate", "njAcVNaDsK");
        setField(term279856, term279856.getClass(), "lastPlayDate", "BLAiTuvVcu");
        setIntField(term279856, term279856.getClass(), "lastPlayCredit", -65424483);
        setIntField(term279856, term279856.getClass(), "lastPlayMode", 1974117816);
        setIntField(term279856, term279856.getClass(), "lastPlaceId", 463127264);
        setField(term279856, term279856.getClass(), "lastPlaceName", "ULOrmjXoPg");
        setIntField(term279856, term279856.getClass(), "lastAllNetId", -787419032);
        setIntField(term279856, term279856.getClass(), "lastRegionId", 992513563);
        setField(term279856, term279856.getClass(), "lastRegionName", "blGAwKqdqO");
        setField(term279856, term279856.getClass(), "lastClientId", "BmJPqfZtnd");
        setField(term279856, term279856.getClass(), "lastCountryCode", "LCmMOQqvkv");
        setIntField(term279856, term279856.getClass(), "lastSelectEMoney", 1574814985);
        setIntField(term279856, term279856.getClass(), "lastSelectTicket", -324668111);
        setIntField(term279856, term279856.getClass(), "lastSelectCourse", 1556199811);
        setIntField(term279856, term279856.getClass(), "lastCountCourse", 1170381399);
        setField(term279856, term279856.getClass(), "firstGameId", "fyjDMAuZiJ");
        setField(term279856, term279856.getClass(), "firstRomVersion", "OGWjAZOglO");
        setField(term279856, term279856.getClass(), "firstDataVersion", "wWxdwPvBFu");
        setField(term279856, term279856.getClass(), "firstPlayDate", "utAzCMewid");
        setField(term279856, term279856.getClass(), "compatibleCmVersion", "IELAUsJQhq");
        setField(term279856, term279856.getClass(), "dailyBonusDate", "ddvFjqCIzo");
        setField(term279856, term279856.getClass(), "dailyCourseBonusDate", "vLEvTfUqXL");
        setField(term279856, term279856.getClass(), "lastPairLoginDate", "vpXbryqFFp");
        setField(term279856, term279856.getClass(), "lastTrialPlayDate", "bITrIdZmIi");
        setIntField(term279856, term279856.getClass(), "playVsCount", 2051375168);
        setIntField(term279856, term279856.getClass(), "playSyncCount", 1951565709);
        setIntField(term279856, term279856.getClass(), "winCount", -609869128);
        setIntField(term279856, term279856.getClass(), "helpCount", -1798058557);
        setIntField(term279856, term279856.getClass(), "comboCount", 1566465773);
        setLongField(term279856, term279856.getClass(), "totalDeluxscore", 8856039144467442032L);
        setLongField(term279856, term279856.getClass(), "totalBasicDeluxscore", -2521675001089650253L);
        setLongField(term279856, term279856.getClass(), "totalAdvancedDeluxscore", -7310720930340308903L);
        setLongField(term279856, term279856.getClass(), "totalExpertDeluxscore", 735866165220348271L);
        setLongField(term279856, term279856.getClass(), "totalMasterDeluxscore", -8046071842340103078L);
        setLongField(term279856, term279856.getClass(), "totalReMasterDeluxscore", 3226653715501122042L);
        setIntField(term279856, term279856.getClass(), "totalSync", -319806392);
        setIntField(term279856, term279856.getClass(), "totalBasicSync", 1425075560);
        setIntField(term279856, term279856.getClass(), "totalAdvancedSync", 314430334);
        setIntField(term279856, term279856.getClass(), "totalExpertSync", -1001978760);
        setIntField(term279856, term279856.getClass(), "totalMasterSync", -255413282);
        setIntField(term279856, term279856.getClass(), "totalReMasterSync", 1797303999);
        setLongField(term279856, term279856.getClass(), "totalAchievement", 5077228121419770846L);
        setLongField(term279856, term279856.getClass(), "totalBasicAchievement", 4946297906946638021L);
        setLongField(term279856, term279856.getClass(), "totalAdvancedAchievement", -1933569314915159368L);
        setLongField(term279856, term279856.getClass(), "totalExpertAchievement", -8039252267793242747L);
        setLongField(term279856, term279856.getClass(), "totalMasterAchievement", -8639981963264329624L);
        setLongField(term279856, term279856.getClass(), "totalReMasterAchievement", -3390782261068284906L);
        setLongField(term279856, term279856.getClass(), "playerOldRating", 7865308931637946011L);
        setLongField(term279856, term279856.getClass(), "playerNewRating", -6943155793411786596L);
        setIntField(term279856, term279856.getClass(), "banState", -327593257);
        setLongField(term279856, term279856.getClass(), "dateTime", 6314696459595846648L);
        term280215 = new Long(-5117468235294750229L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term280215;
        callMethod(klass, "setTotalMasterAchievement", argTypes, term279856, args);
    }

};


