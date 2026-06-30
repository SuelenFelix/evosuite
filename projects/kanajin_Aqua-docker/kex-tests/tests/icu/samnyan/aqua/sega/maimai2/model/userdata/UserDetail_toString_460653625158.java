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

public class UserDetail_toString_460653625158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285038;

    public UserDetail_toString_460653625158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term285042 = new Long(4530705892517898929L);
        ArrayList term285103 = new ArrayList();
        Integer term285109 = new Integer(1651622020);
        Integer term285111 = new Integer(-1935395656);
        Integer term285113 = new Integer(-530623408);
        Integer term285115 = new Integer(1949662959);
        Integer term285117 = new Integer(1639772797);
        Integer term285119 = new Integer(-228932741);
        Integer term285121 = new Integer(-134006257);
        ArrayList term285107 = new ArrayList();
        ((ArrayList) term285107).add(term285109);
        ((ArrayList) term285107).add(term285111);
        ((ArrayList) term285107).add(term285113);
        ((ArrayList) term285107).add(term285115);
        ((ArrayList) term285107).add(term285117);
        ((ArrayList) term285107).add(term285119);
        ((ArrayList) term285107).add(term285121);
        term285038 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term285040 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term285056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285071 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term285038, term285038.getClass(), "id", 7305826469715869983L);
        setLongField(term285040, term285040.getClass(), "id", 5437985982644107546L);
        setField(term285040, term285040.getClass(), "extId", term285042);
        setField(term285040, term285040.getClass(), "luid", "dVpvPFhLJa");
        setIntField(term285057, term285057.getClass(), "year", 2010);
        setShortField(term285057, term285057.getClass(), "month", (short) 9);
        setShortField(term285057, term285057.getClass(), "day", (short) 8);
        setField(term285056, term285056.getClass(), "date", term285057);
        setByteField(term285061, term285061.getClass(), "hour", (byte) 10);
        setByteField(term285061, term285061.getClass(), "minute", (byte) 51);
        setByteField(term285061, term285061.getClass(), "second", (byte) 17);
        setIntField(term285061, term285061.getClass(), "nano", 736149959);
        setField(term285056, term285056.getClass(), "time", term285061);
        setField(term285040, term285040.getClass(), "registerTime", term285056);
        setIntField(term285067, term285067.getClass(), "year", 2022);
        setShortField(term285067, term285067.getClass(), "month", (short) 6);
        setShortField(term285067, term285067.getClass(), "day", (short) 3);
        setField(term285066, term285066.getClass(), "date", term285067);
        setByteField(term285071, term285071.getClass(), "hour", (byte) 14);
        setByteField(term285071, term285071.getClass(), "minute", (byte) 38);
        setByteField(term285071, term285071.getClass(), "second", (byte) 25);
        setIntField(term285071, term285071.getClass(), "nano", 986041484);
        setField(term285066, term285066.getClass(), "time", term285071);
        setField(term285040, term285040.getClass(), "accessTime", term285066);
        setField(term285038, term285038.getClass(), "card", term285040);
        setField(term285038, term285038.getClass(), "userName", "nYddaWYRuk");
        setIntField(term285038, term285038.getClass(), "isNetMember", -923390407);
        setIntField(term285038, term285038.getClass(), "iconId", -611768568);
        setIntField(term285038, term285038.getClass(), "plateId", 479240257);
        setIntField(term285038, term285038.getClass(), "titleId", -921251972);
        setIntField(term285038, term285038.getClass(), "partnerId", 739178487);
        setIntField(term285038, term285038.getClass(), "frameId", -1669064978);
        setIntField(term285038, term285038.getClass(), "selectMapId", -1350650574);
        setIntField(term285038, term285038.getClass(), "totalAwake", -188618513);
        setIntField(term285038, term285038.getClass(), "gradeRating", 2032473075);
        setIntField(term285038, term285038.getClass(), "musicRating", 2015184957);
        setIntField(term285038, term285038.getClass(), "playerRating", 1154663622);
        setIntField(term285038, term285038.getClass(), "highestRating", 1056435262);
        setIntField(term285038, term285038.getClass(), "gradeRank", 2016018259);
        setIntField(term285038, term285038.getClass(), "classRank", 615756327);
        setIntField(term285038, term285038.getClass(), "courseRank", -1171119194);
        setField(term285038, term285038.getClass(), "charaSlot", term285103);
        setField(term285038, term285038.getClass(), "charaLockSlot", term285107);
        setLongField(term285038, term285038.getClass(), "contentBit", 3291518710212116700L);
        setIntField(term285038, term285038.getClass(), "playCount", -2070175203);
        setField(term285038, term285038.getClass(), "eventWatchedDate", "hYccvdkHbX");
        setField(term285038, term285038.getClass(), "lastGameId", "XpZzRDvdQI");
        setField(term285038, term285038.getClass(), "lastRomVersion", "FRoNgCiZLX");
        setField(term285038, term285038.getClass(), "lastDataVersion", "UOXgkNLMRL");
        setField(term285038, term285038.getClass(), "lastLoginDate", "wBXsGOdIpa");
        setField(term285038, term285038.getClass(), "lastPlayDate", "CJGSdgnFDl");
        setIntField(term285038, term285038.getClass(), "lastPlayCredit", 883783872);
        setIntField(term285038, term285038.getClass(), "lastPlayMode", -378128944);
        setIntField(term285038, term285038.getClass(), "lastPlaceId", -40756380);
        setField(term285038, term285038.getClass(), "lastPlaceName", "XgQiiPxpaD");
        setIntField(term285038, term285038.getClass(), "lastAllNetId", 1408392536);
        setIntField(term285038, term285038.getClass(), "lastRegionId", -2144080312);
        setField(term285038, term285038.getClass(), "lastRegionName", "xROqxqAGWR");
        setField(term285038, term285038.getClass(), "lastClientId", "dRXkMNRcuO");
        setField(term285038, term285038.getClass(), "lastCountryCode", "YEewitiOrD");
        setIntField(term285038, term285038.getClass(), "lastSelectEMoney", -904183704);
        setIntField(term285038, term285038.getClass(), "lastSelectTicket", 1752556805);
        setIntField(term285038, term285038.getClass(), "lastSelectCourse", -557171448);
        setIntField(term285038, term285038.getClass(), "lastCountCourse", -1947507324);
        setField(term285038, term285038.getClass(), "firstGameId", "IvozCNqdhn");
        setField(term285038, term285038.getClass(), "firstRomVersion", "jzJpPjgqpB");
        setField(term285038, term285038.getClass(), "firstDataVersion", "IrpYnHzyOp");
        setField(term285038, term285038.getClass(), "firstPlayDate", "SAOqfVTYAP");
        setField(term285038, term285038.getClass(), "compatibleCmVersion", "KSxwTbabol");
        setField(term285038, term285038.getClass(), "dailyBonusDate", "DDmdhVOVfJ");
        setField(term285038, term285038.getClass(), "dailyCourseBonusDate", "HjhkuKttGf");
        setField(term285038, term285038.getClass(), "lastPairLoginDate", "oOcNDSgWLE");
        setField(term285038, term285038.getClass(), "lastTrialPlayDate", "yOWvnntxzG");
        setIntField(term285038, term285038.getClass(), "playVsCount", -1163396485);
        setIntField(term285038, term285038.getClass(), "playSyncCount", 968050623);
        setIntField(term285038, term285038.getClass(), "winCount", -830087679);
        setIntField(term285038, term285038.getClass(), "helpCount", -503037443);
        setIntField(term285038, term285038.getClass(), "comboCount", 682268807);
        setLongField(term285038, term285038.getClass(), "totalDeluxscore", -270807304746600247L);
        setLongField(term285038, term285038.getClass(), "totalBasicDeluxscore", -5327772887080514038L);
        setLongField(term285038, term285038.getClass(), "totalAdvancedDeluxscore", -324332089203589093L);
        setLongField(term285038, term285038.getClass(), "totalExpertDeluxscore", 1950750625043836572L);
        setLongField(term285038, term285038.getClass(), "totalMasterDeluxscore", 1026584969137750142L);
        setLongField(term285038, term285038.getClass(), "totalReMasterDeluxscore", -8727211245529612809L);
        setIntField(term285038, term285038.getClass(), "totalSync", 136044547);
        setIntField(term285038, term285038.getClass(), "totalBasicSync", 464334734);
        setIntField(term285038, term285038.getClass(), "totalAdvancedSync", 2070253003);
        setIntField(term285038, term285038.getClass(), "totalExpertSync", 1634771150);
        setIntField(term285038, term285038.getClass(), "totalMasterSync", 1103450812);
        setIntField(term285038, term285038.getClass(), "totalReMasterSync", 1483366240);
        setLongField(term285038, term285038.getClass(), "totalAchievement", 5075956868162459884L);
        setLongField(term285038, term285038.getClass(), "totalBasicAchievement", -508924396560569422L);
        setLongField(term285038, term285038.getClass(), "totalAdvancedAchievement", -3133500101108859828L);
        setLongField(term285038, term285038.getClass(), "totalExpertAchievement", 9113419520368452252L);
        setLongField(term285038, term285038.getClass(), "totalMasterAchievement", 1085977630858091032L);
        setLongField(term285038, term285038.getClass(), "totalReMasterAchievement", -2488674004751279102L);
        setLongField(term285038, term285038.getClass(), "playerOldRating", -2514397971875680961L);
        setLongField(term285038, term285038.getClass(), "playerNewRating", 2340463523923829553L);
        setIntField(term285038, term285038.getClass(), "banState", -808802177);
        setLongField(term285038, term285038.getClass(), "dateTime", -5193916100063079093L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term285038, args);
    }

};


