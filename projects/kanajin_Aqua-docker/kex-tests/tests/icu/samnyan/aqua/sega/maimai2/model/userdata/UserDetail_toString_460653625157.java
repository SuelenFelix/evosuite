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

public class UserDetail_toString_460653625157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284983;

    public UserDetail_toString_460653625157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term284987 = new Long(4530705892517898929L);
        ArrayList term285048 = new ArrayList();
        Integer term285054 = new Integer(1651622020);
        Integer term285056 = new Integer(-1935395656);
        Integer term285058 = new Integer(-530623408);
        Integer term285060 = new Integer(1949662959);
        Integer term285062 = new Integer(1639772797);
        Integer term285064 = new Integer(-228932741);
        Integer term285066 = new Integer(-134006257);
        ArrayList term285052 = new ArrayList();
        ((ArrayList) term285052).add(term285054);
        ((ArrayList) term285052).add(term285056);
        ((ArrayList) term285052).add(term285058);
        ((ArrayList) term285052).add(term285060);
        ((ArrayList) term285052).add(term285062);
        ((ArrayList) term285052).add(term285064);
        ((ArrayList) term285052).add(term285066);
        term284983 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term284985 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term285001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285016 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term284983, term284983.getClass(), "id", 7305826469715869983L);
        setLongField(term284985, term284985.getClass(), "id", 5437985982644107546L);
        setField(term284985, term284985.getClass(), "extId", term284987);
        setField(term284985, term284985.getClass(), "luid", "dVpvPFhLJa");
        setIntField(term285002, term285002.getClass(), "year", 2010);
        setShortField(term285002, term285002.getClass(), "month", (short) 9);
        setShortField(term285002, term285002.getClass(), "day", (short) 8);
        setField(term285001, term285001.getClass(), "date", term285002);
        setByteField(term285006, term285006.getClass(), "hour", (byte) 10);
        setByteField(term285006, term285006.getClass(), "minute", (byte) 51);
        setByteField(term285006, term285006.getClass(), "second", (byte) 17);
        setIntField(term285006, term285006.getClass(), "nano", 736149959);
        setField(term285001, term285001.getClass(), "time", term285006);
        setField(term284985, term284985.getClass(), "registerTime", term285001);
        setIntField(term285012, term285012.getClass(), "year", 2022);
        setShortField(term285012, term285012.getClass(), "month", (short) 6);
        setShortField(term285012, term285012.getClass(), "day", (short) 3);
        setField(term285011, term285011.getClass(), "date", term285012);
        setByteField(term285016, term285016.getClass(), "hour", (byte) 14);
        setByteField(term285016, term285016.getClass(), "minute", (byte) 38);
        setByteField(term285016, term285016.getClass(), "second", (byte) 25);
        setIntField(term285016, term285016.getClass(), "nano", 986041484);
        setField(term285011, term285011.getClass(), "time", term285016);
        setField(term284985, term284985.getClass(), "accessTime", term285011);
        setField(term284983, term284983.getClass(), "card", term284985);
        setField(term284983, term284983.getClass(), "userName", "nYddaWYRuk");
        setIntField(term284983, term284983.getClass(), "isNetMember", -923390407);
        setIntField(term284983, term284983.getClass(), "iconId", -611768568);
        setIntField(term284983, term284983.getClass(), "plateId", 479240257);
        setIntField(term284983, term284983.getClass(), "titleId", -921251972);
        setIntField(term284983, term284983.getClass(), "partnerId", 739178487);
        setIntField(term284983, term284983.getClass(), "frameId", -1669064978);
        setIntField(term284983, term284983.getClass(), "selectMapId", -1350650574);
        setIntField(term284983, term284983.getClass(), "totalAwake", -188618513);
        setIntField(term284983, term284983.getClass(), "gradeRating", 2032473075);
        setIntField(term284983, term284983.getClass(), "musicRating", 2015184957);
        setIntField(term284983, term284983.getClass(), "playerRating", 1154663622);
        setIntField(term284983, term284983.getClass(), "highestRating", 1056435262);
        setIntField(term284983, term284983.getClass(), "gradeRank", 2016018259);
        setIntField(term284983, term284983.getClass(), "classRank", 615756327);
        setIntField(term284983, term284983.getClass(), "courseRank", -1171119194);
        setField(term284983, term284983.getClass(), "charaSlot", term285048);
        setField(term284983, term284983.getClass(), "charaLockSlot", term285052);
        setLongField(term284983, term284983.getClass(), "contentBit", 3291518710212116700L);
        setIntField(term284983, term284983.getClass(), "playCount", -2070175203);
        setField(term284983, term284983.getClass(), "eventWatchedDate", "hYccvdkHbX");
        setField(term284983, term284983.getClass(), "lastGameId", "XpZzRDvdQI");
        setField(term284983, term284983.getClass(), "lastRomVersion", "FRoNgCiZLX");
        setField(term284983, term284983.getClass(), "lastDataVersion", "UOXgkNLMRL");
        setField(term284983, term284983.getClass(), "lastLoginDate", "wBXsGOdIpa");
        setField(term284983, term284983.getClass(), "lastPlayDate", "CJGSdgnFDl");
        setIntField(term284983, term284983.getClass(), "lastPlayCredit", 883783872);
        setIntField(term284983, term284983.getClass(), "lastPlayMode", -378128944);
        setIntField(term284983, term284983.getClass(), "lastPlaceId", -40756380);
        setField(term284983, term284983.getClass(), "lastPlaceName", "XgQiiPxpaD");
        setIntField(term284983, term284983.getClass(), "lastAllNetId", 1408392536);
        setIntField(term284983, term284983.getClass(), "lastRegionId", -2144080312);
        setField(term284983, term284983.getClass(), "lastRegionName", "xROqxqAGWR");
        setField(term284983, term284983.getClass(), "lastClientId", "dRXkMNRcuO");
        setField(term284983, term284983.getClass(), "lastCountryCode", "YEewitiOrD");
        setIntField(term284983, term284983.getClass(), "lastSelectEMoney", -904183704);
        setIntField(term284983, term284983.getClass(), "lastSelectTicket", 1752556805);
        setIntField(term284983, term284983.getClass(), "lastSelectCourse", -557171448);
        setIntField(term284983, term284983.getClass(), "lastCountCourse", -1947507324);
        setField(term284983, term284983.getClass(), "firstGameId", "IvozCNqdhn");
        setField(term284983, term284983.getClass(), "firstRomVersion", "jzJpPjgqpB");
        setField(term284983, term284983.getClass(), "firstDataVersion", "IrpYnHzyOp");
        setField(term284983, term284983.getClass(), "firstPlayDate", "SAOqfVTYAP");
        setField(term284983, term284983.getClass(), "compatibleCmVersion", "KSxwTbabol");
        setField(term284983, term284983.getClass(), "dailyBonusDate", "DDmdhVOVfJ");
        setField(term284983, term284983.getClass(), "dailyCourseBonusDate", "HjhkuKttGf");
        setField(term284983, term284983.getClass(), "lastPairLoginDate", "oOcNDSgWLE");
        setField(term284983, term284983.getClass(), "lastTrialPlayDate", "yOWvnntxzG");
        setIntField(term284983, term284983.getClass(), "playVsCount", -1163396485);
        setIntField(term284983, term284983.getClass(), "playSyncCount", 968050623);
        setIntField(term284983, term284983.getClass(), "winCount", -830087679);
        setIntField(term284983, term284983.getClass(), "helpCount", -503037443);
        setIntField(term284983, term284983.getClass(), "comboCount", 682268807);
        setLongField(term284983, term284983.getClass(), "totalDeluxscore", -270807304746600247L);
        setLongField(term284983, term284983.getClass(), "totalBasicDeluxscore", -5327772887080514038L);
        setLongField(term284983, term284983.getClass(), "totalAdvancedDeluxscore", -324332089203589093L);
        setLongField(term284983, term284983.getClass(), "totalExpertDeluxscore", 1950750625043836572L);
        setLongField(term284983, term284983.getClass(), "totalMasterDeluxscore", 1026584969137750142L);
        setLongField(term284983, term284983.getClass(), "totalReMasterDeluxscore", -8727211245529612809L);
        setIntField(term284983, term284983.getClass(), "totalSync", 136044547);
        setIntField(term284983, term284983.getClass(), "totalBasicSync", 464334734);
        setIntField(term284983, term284983.getClass(), "totalAdvancedSync", 2070253003);
        setIntField(term284983, term284983.getClass(), "totalExpertSync", 1634771150);
        setIntField(term284983, term284983.getClass(), "totalMasterSync", 1103450812);
        setIntField(term284983, term284983.getClass(), "totalReMasterSync", 1483366240);
        setLongField(term284983, term284983.getClass(), "totalAchievement", 5075956868162459884L);
        setLongField(term284983, term284983.getClass(), "totalBasicAchievement", -508924396560569422L);
        setLongField(term284983, term284983.getClass(), "totalAdvancedAchievement", -3133500101108859828L);
        setLongField(term284983, term284983.getClass(), "totalExpertAchievement", 9113419520368452252L);
        setLongField(term284983, term284983.getClass(), "totalMasterAchievement", 1085977630858091032L);
        setLongField(term284983, term284983.getClass(), "totalReMasterAchievement", -2488674004751279102L);
        setLongField(term284983, term284983.getClass(), "playerOldRating", -2514397971875680961L);
        setLongField(term284983, term284983.getClass(), "playerNewRating", 2340463523923829553L);
        setIntField(term284983, term284983.getClass(), "banState", -808802177);
        setLongField(term284983, term284983.getClass(), "dateTime", -5193916100063079093L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term284983, args);
    }

};


