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

public class UserDetail_setTotalMasterAchievement_426561655149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279911;
     Object term280270;

    public UserDetail_setTotalMasterAchievement_426561655149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term279915 = new Long(-8705953038984862378L);
        Integer term279978 = new Integer(1191665770);
        Integer term279980 = new Integer(-401274751);
        Integer term279982 = new Integer(2063937149);
        Integer term279984 = new Integer(166881458);
        Integer term279986 = new Integer(828853234);
        Integer term279988 = new Integer(1203278976);
        Integer term279990 = new Integer(751787241);
        ArrayList term279976 = new ArrayList();
        ((ArrayList) term279976).add(term279978);
        ((ArrayList) term279976).add(term279980);
        ((ArrayList) term279976).add(term279982);
        ((ArrayList) term279976).add(term279984);
        ((ArrayList) term279976).add(term279986);
        ((ArrayList) term279976).add(term279988);
        ((ArrayList) term279976).add(term279990);
        Integer term279996 = new Integer(477748320);
        Integer term279998 = new Integer(512793147);
        Integer term280000 = new Integer(-2061386860);
        ArrayList term279994 = new ArrayList();
        ((ArrayList) term279994).add(term279996);
        ((ArrayList) term279994).add(term279998);
        ((ArrayList) term279994).add(term280000);
        term279911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term279913 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term279929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279934 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279944 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term279911, term279911.getClass(), "id", 2500873604963348111L);
        setLongField(term279913, term279913.getClass(), "id", 5217198968737211545L);
        setField(term279913, term279913.getClass(), "extId", term279915);
        setField(term279913, term279913.getClass(), "luid", "XRvQvyRaeI");
        setIntField(term279930, term279930.getClass(), "year", 2026);
        setShortField(term279930, term279930.getClass(), "month", (short) 3);
        setShortField(term279930, term279930.getClass(), "day", (short) 11);
        setField(term279929, term279929.getClass(), "date", term279930);
        setByteField(term279934, term279934.getClass(), "hour", (byte) 5);
        setByteField(term279934, term279934.getClass(), "minute", (byte) 28);
        setByteField(term279934, term279934.getClass(), "second", (byte) 38);
        setIntField(term279934, term279934.getClass(), "nano", 951846633);
        setField(term279929, term279929.getClass(), "time", term279934);
        setField(term279913, term279913.getClass(), "registerTime", term279929);
        setIntField(term279940, term279940.getClass(), "year", 2025);
        setShortField(term279940, term279940.getClass(), "month", (short) 3);
        setShortField(term279940, term279940.getClass(), "day", (short) 12);
        setField(term279939, term279939.getClass(), "date", term279940);
        setByteField(term279944, term279944.getClass(), "hour", (byte) 2);
        setByteField(term279944, term279944.getClass(), "minute", (byte) 17);
        setByteField(term279944, term279944.getClass(), "second", (byte) 13);
        setIntField(term279944, term279944.getClass(), "nano", 667967879);
        setField(term279939, term279939.getClass(), "time", term279944);
        setField(term279913, term279913.getClass(), "accessTime", term279939);
        setField(term279911, term279911.getClass(), "card", term279913);
        setField(term279911, term279911.getClass(), "userName", "PiiAJlvOam");
        setIntField(term279911, term279911.getClass(), "isNetMember", -1177568076);
        setIntField(term279911, term279911.getClass(), "iconId", 2119973929);
        setIntField(term279911, term279911.getClass(), "plateId", 617926596);
        setIntField(term279911, term279911.getClass(), "titleId", 1992438907);
        setIntField(term279911, term279911.getClass(), "partnerId", 428161876);
        setIntField(term279911, term279911.getClass(), "frameId", -265853482);
        setIntField(term279911, term279911.getClass(), "selectMapId", -1169211096);
        setIntField(term279911, term279911.getClass(), "totalAwake", 1551300037);
        setIntField(term279911, term279911.getClass(), "gradeRating", -1203470065);
        setIntField(term279911, term279911.getClass(), "musicRating", 1164893503);
        setIntField(term279911, term279911.getClass(), "playerRating", -1051326797);
        setIntField(term279911, term279911.getClass(), "highestRating", -694443859);
        setIntField(term279911, term279911.getClass(), "gradeRank", -1566825264);
        setIntField(term279911, term279911.getClass(), "classRank", 364041118);
        setIntField(term279911, term279911.getClass(), "courseRank", -1797543289);
        setField(term279911, term279911.getClass(), "charaSlot", term279976);
        setField(term279911, term279911.getClass(), "charaLockSlot", term279994);
        setLongField(term279911, term279911.getClass(), "contentBit", -3780966725992104975L);
        setIntField(term279911, term279911.getClass(), "playCount", -73122887);
        setField(term279911, term279911.getClass(), "eventWatchedDate", "siXyhYgybV");
        setField(term279911, term279911.getClass(), "lastGameId", "ZyNlPlXuvg");
        setField(term279911, term279911.getClass(), "lastRomVersion", "OXzFwGxUWY");
        setField(term279911, term279911.getClass(), "lastDataVersion", "hlYhjhXVeY");
        setField(term279911, term279911.getClass(), "lastLoginDate", "njAcVNaDsK");
        setField(term279911, term279911.getClass(), "lastPlayDate", "BLAiTuvVcu");
        setIntField(term279911, term279911.getClass(), "lastPlayCredit", -65424483);
        setIntField(term279911, term279911.getClass(), "lastPlayMode", 1974117816);
        setIntField(term279911, term279911.getClass(), "lastPlaceId", 463127264);
        setField(term279911, term279911.getClass(), "lastPlaceName", "ULOrmjXoPg");
        setIntField(term279911, term279911.getClass(), "lastAllNetId", -787419032);
        setIntField(term279911, term279911.getClass(), "lastRegionId", 992513563);
        setField(term279911, term279911.getClass(), "lastRegionName", "blGAwKqdqO");
        setField(term279911, term279911.getClass(), "lastClientId", "BmJPqfZtnd");
        setField(term279911, term279911.getClass(), "lastCountryCode", "LCmMOQqvkv");
        setIntField(term279911, term279911.getClass(), "lastSelectEMoney", 1574814985);
        setIntField(term279911, term279911.getClass(), "lastSelectTicket", -324668111);
        setIntField(term279911, term279911.getClass(), "lastSelectCourse", 1556199811);
        setIntField(term279911, term279911.getClass(), "lastCountCourse", 1170381399);
        setField(term279911, term279911.getClass(), "firstGameId", "fyjDMAuZiJ");
        setField(term279911, term279911.getClass(), "firstRomVersion", "OGWjAZOglO");
        setField(term279911, term279911.getClass(), "firstDataVersion", "wWxdwPvBFu");
        setField(term279911, term279911.getClass(), "firstPlayDate", "utAzCMewid");
        setField(term279911, term279911.getClass(), "compatibleCmVersion", "IELAUsJQhq");
        setField(term279911, term279911.getClass(), "dailyBonusDate", "ddvFjqCIzo");
        setField(term279911, term279911.getClass(), "dailyCourseBonusDate", "vLEvTfUqXL");
        setField(term279911, term279911.getClass(), "lastPairLoginDate", "vpXbryqFFp");
        setField(term279911, term279911.getClass(), "lastTrialPlayDate", "bITrIdZmIi");
        setIntField(term279911, term279911.getClass(), "playVsCount", 2051375168);
        setIntField(term279911, term279911.getClass(), "playSyncCount", 1951565709);
        setIntField(term279911, term279911.getClass(), "winCount", -609869128);
        setIntField(term279911, term279911.getClass(), "helpCount", -1798058557);
        setIntField(term279911, term279911.getClass(), "comboCount", 1566465773);
        setLongField(term279911, term279911.getClass(), "totalDeluxscore", 8856039144467442032L);
        setLongField(term279911, term279911.getClass(), "totalBasicDeluxscore", -2521675001089650253L);
        setLongField(term279911, term279911.getClass(), "totalAdvancedDeluxscore", -7310720930340308903L);
        setLongField(term279911, term279911.getClass(), "totalExpertDeluxscore", 735866165220348271L);
        setLongField(term279911, term279911.getClass(), "totalMasterDeluxscore", -8046071842340103078L);
        setLongField(term279911, term279911.getClass(), "totalReMasterDeluxscore", 3226653715501122042L);
        setIntField(term279911, term279911.getClass(), "totalSync", -319806392);
        setIntField(term279911, term279911.getClass(), "totalBasicSync", 1425075560);
        setIntField(term279911, term279911.getClass(), "totalAdvancedSync", 314430334);
        setIntField(term279911, term279911.getClass(), "totalExpertSync", -1001978760);
        setIntField(term279911, term279911.getClass(), "totalMasterSync", -255413282);
        setIntField(term279911, term279911.getClass(), "totalReMasterSync", 1797303999);
        setLongField(term279911, term279911.getClass(), "totalAchievement", 5077228121419770846L);
        setLongField(term279911, term279911.getClass(), "totalBasicAchievement", 4946297906946638021L);
        setLongField(term279911, term279911.getClass(), "totalAdvancedAchievement", -1933569314915159368L);
        setLongField(term279911, term279911.getClass(), "totalExpertAchievement", -8039252267793242747L);
        setLongField(term279911, term279911.getClass(), "totalMasterAchievement", -8639981963264329624L);
        setLongField(term279911, term279911.getClass(), "totalReMasterAchievement", -3390782261068284906L);
        setLongField(term279911, term279911.getClass(), "playerOldRating", 7865308931637946011L);
        setLongField(term279911, term279911.getClass(), "playerNewRating", -6943155793411786596L);
        setIntField(term279911, term279911.getClass(), "banState", -327593257);
        setLongField(term279911, term279911.getClass(), "dateTime", 6314696459595846648L);
        term280270 = new Long(-5117468235294750229L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term280270;
        callMethod(klass, "setTotalMasterAchievement", argTypes, term279911, args);
    }

};


