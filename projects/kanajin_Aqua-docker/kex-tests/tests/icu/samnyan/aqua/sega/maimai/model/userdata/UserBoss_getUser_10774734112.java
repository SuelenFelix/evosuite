package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserBoss_getUser_10774734112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89495;

    public UserBoss_getUser_10774734112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term89501 = new Long(-8477368071089201577L);
        term89495 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term89497 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term89499 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term89515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89530 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term89495, term89495.getClass(), "id", -8854988339892073229L);
        setLongField(term89497, term89497.getClass(), "id", 2769081086274438111L);
        setLongField(term89499, term89499.getClass(), "id", -6339531459447942677L);
        setField(term89499, term89499.getClass(), "extId", term89501);
        setField(term89499, term89499.getClass(), "luid", "fAcvTHLHOa");
        setIntField(term89516, term89516.getClass(), "year", 2010);
        setShortField(term89516, term89516.getClass(), "month", (short) 7);
        setShortField(term89516, term89516.getClass(), "day", (short) 15);
        setField(term89515, term89515.getClass(), "date", term89516);
        setByteField(term89520, term89520.getClass(), "hour", (byte) 10);
        setByteField(term89520, term89520.getClass(), "minute", (byte) 47);
        setByteField(term89520, term89520.getClass(), "second", (byte) 0);
        setIntField(term89520, term89520.getClass(), "nano", 513170187);
        setField(term89515, term89515.getClass(), "time", term89520);
        setField(term89499, term89499.getClass(), "registerTime", term89515);
        setIntField(term89526, term89526.getClass(), "year", 2022);
        setShortField(term89526, term89526.getClass(), "month", (short) 3);
        setShortField(term89526, term89526.getClass(), "day", (short) 1);
        setField(term89525, term89525.getClass(), "date", term89526);
        setByteField(term89530, term89530.getClass(), "hour", (byte) 15);
        setByteField(term89530, term89530.getClass(), "minute", (byte) 32);
        setByteField(term89530, term89530.getClass(), "second", (byte) 30);
        setIntField(term89530, term89530.getClass(), "nano", 406959223);
        setField(term89525, term89525.getClass(), "time", term89530);
        setField(term89499, term89499.getClass(), "accessTime", term89525);
        setField(term89497, term89497.getClass(), "card", term89499);
        setIntField(term89497, term89497.getClass(), "lastDataVersion", 478918889);
        setField(term89497, term89497.getClass(), "userName", "QavvcNVesW");
        setIntField(term89497, term89497.getClass(), "point", 750079737);
        setIntField(term89497, term89497.getClass(), "totalPoint", -1296400594);
        setIntField(term89497, term89497.getClass(), "iconId", 1238281654);
        setIntField(term89497, term89497.getClass(), "nameplateId", 369742636);
        setIntField(term89497, term89497.getClass(), "frameId", -1541868819);
        setIntField(term89497, term89497.getClass(), "trophyId", 1305998954);
        setIntField(term89497, term89497.getClass(), "playCount", 433793843);
        setIntField(term89497, term89497.getClass(), "playVsCount", -2139860020);
        setIntField(term89497, term89497.getClass(), "playSyncCount", 1169604514);
        setIntField(term89497, term89497.getClass(), "winCount", 838946722);
        setIntField(term89497, term89497.getClass(), "helpCount", 757054652);
        setIntField(term89497, term89497.getClass(), "comboCount", 1524588225);
        setIntField(term89497, term89497.getClass(), "feverCount", -659368843);
        setIntField(term89497, term89497.getClass(), "totalHiScore", 1745645738);
        setIntField(term89497, term89497.getClass(), "totalEasyHighScore", -500405572);
        setIntField(term89497, term89497.getClass(), "totalBasicHighScore", 81259518);
        setIntField(term89497, term89497.getClass(), "totalAdvancedHighScore", 1396067902);
        setIntField(term89497, term89497.getClass(), "totalExpertHighScore", 1776157151);
        setIntField(term89497, term89497.getClass(), "totalMasterHighScore", 358349632);
        setIntField(term89497, term89497.getClass(), "totalReMasterHighScore", 378160100);
        setIntField(term89497, term89497.getClass(), "totalHighSync", -913146699);
        setIntField(term89497, term89497.getClass(), "totalEasySync", -2037448252);
        setIntField(term89497, term89497.getClass(), "totalBasicSync", -337985535);
        setIntField(term89497, term89497.getClass(), "totalAdvancedSync", 1399803639);
        setIntField(term89497, term89497.getClass(), "totalExpertSync", 160926225);
        setIntField(term89497, term89497.getClass(), "totalMasterSync", -1541440051);
        setIntField(term89497, term89497.getClass(), "totalReMasterSync", 440254626);
        setIntField(term89497, term89497.getClass(), "playerRating", 2001906899);
        setIntField(term89497, term89497.getClass(), "highestRating", 532379889);
        setIntField(term89497, term89497.getClass(), "rankAuthTailId", -1084521349);
        setField(term89497, term89497.getClass(), "eventWatchedDate", "JmFxhkDeIA");
        setField(term89497, term89497.getClass(), "webLimitDate", "XcJqDBnnMZ");
        setIntField(term89497, term89497.getClass(), "challengeTrackPhase", -1930705611);
        setIntField(term89497, term89497.getClass(), "firstPlayBits", 1949222496);
        setField(term89497, term89497.getClass(), "lastPlayDate", "SchXFoqYFy");
        setIntField(term89497, term89497.getClass(), "lastPlaceId", 1176018048);
        setField(term89497, term89497.getClass(), "lastPlaceName", "MnHKbTZBTr");
        setIntField(term89497, term89497.getClass(), "lastRegionId", 1196729512);
        setField(term89497, term89497.getClass(), "lastRegionName", "xCNDHQZBKx");
        setField(term89497, term89497.getClass(), "lastClientId", "OfXdotjbuM");
        setField(term89497, term89497.getClass(), "lastCountryCode", "DNkENYBesD");
        setIntField(term89497, term89497.getClass(), "eventPoint", -1129446141);
        setIntField(term89497, term89497.getClass(), "totalLv", -2055516348);
        setIntField(term89497, term89497.getClass(), "lastLoginBonusDay", -1810305325);
        setIntField(term89497, term89497.getClass(), "lastSurvivalBonusDay", 891522595);
        setIntField(term89497, term89497.getClass(), "loginBonusLv", 584482188);
        setField(term89495, term89495.getClass(), "user", term89497);
        setLongField(term89495, term89495.getClass(), "pandoraFlagList0", 2014229530618878786L);
        setLongField(term89495, term89495.getClass(), "pandoraFlagList1", -3684549603148553700L);
        setLongField(term89495, term89495.getClass(), "pandoraFlagList2", 4665980239039735158L);
        setLongField(term89495, term89495.getClass(), "pandoraFlagList3", 7429946509853918683L);
        setLongField(term89495, term89495.getClass(), "pandoraFlagList4", -7148236042086608592L);
        setLongField(term89495, term89495.getClass(), "pandoraFlagList5", 7716258711075652753L);
        setLongField(term89495, term89495.getClass(), "pandoraFlagList6", -3988042285731673145L);
        setLongField(term89495, term89495.getClass(), "emblemFlagList", 1729206737148270563L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term89495, args);
    }

};


