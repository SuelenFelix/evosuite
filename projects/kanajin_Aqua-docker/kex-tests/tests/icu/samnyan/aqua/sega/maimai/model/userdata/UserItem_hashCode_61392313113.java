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

public class UserItem_hashCode_61392313113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88061;

    public UserItem_hashCode_61392313113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term88067 = new Long(-593735869267672817L);
        term88061 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term88063 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term88065 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term88081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88086 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88096 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88061, term88061.getClass(), "id", -4851193391918639512L);
        setLongField(term88063, term88063.getClass(), "id", -7163612258041042650L);
        setLongField(term88065, term88065.getClass(), "id", -7186158121023817313L);
        setField(term88065, term88065.getClass(), "extId", term88067);
        setField(term88065, term88065.getClass(), "luid", "QxSwOpnogl");
        setIntField(term88082, term88082.getClass(), "year", 2022);
        setShortField(term88082, term88082.getClass(), "month", (short) 5);
        setShortField(term88082, term88082.getClass(), "day", (short) 26);
        setField(term88081, term88081.getClass(), "date", term88082);
        setByteField(term88086, term88086.getClass(), "hour", (byte) 16);
        setByteField(term88086, term88086.getClass(), "minute", (byte) 7);
        setByteField(term88086, term88086.getClass(), "second", (byte) 6);
        setIntField(term88086, term88086.getClass(), "nano", 65239619);
        setField(term88081, term88081.getClass(), "time", term88086);
        setField(term88065, term88065.getClass(), "registerTime", term88081);
        setIntField(term88092, term88092.getClass(), "year", 2021);
        setShortField(term88092, term88092.getClass(), "month", (short) 4);
        setShortField(term88092, term88092.getClass(), "day", (short) 22);
        setField(term88091, term88091.getClass(), "date", term88092);
        setByteField(term88096, term88096.getClass(), "hour", (byte) 4);
        setByteField(term88096, term88096.getClass(), "minute", (byte) 51);
        setByteField(term88096, term88096.getClass(), "second", (byte) 42);
        setIntField(term88096, term88096.getClass(), "nano", 408430084);
        setField(term88091, term88091.getClass(), "time", term88096);
        setField(term88065, term88065.getClass(), "accessTime", term88091);
        setField(term88063, term88063.getClass(), "card", term88065);
        setIntField(term88063, term88063.getClass(), "lastDataVersion", -1518118529);
        setField(term88063, term88063.getClass(), "userName", "wXeTrDfRqa");
        setIntField(term88063, term88063.getClass(), "point", -1644443791);
        setIntField(term88063, term88063.getClass(), "totalPoint", -1589974536);
        setIntField(term88063, term88063.getClass(), "iconId", -691561016);
        setIntField(term88063, term88063.getClass(), "nameplateId", -75298071);
        setIntField(term88063, term88063.getClass(), "frameId", 537381033);
        setIntField(term88063, term88063.getClass(), "trophyId", -1941811470);
        setIntField(term88063, term88063.getClass(), "playCount", -345897968);
        setIntField(term88063, term88063.getClass(), "playVsCount", 2043612680);
        setIntField(term88063, term88063.getClass(), "playSyncCount", -872188429);
        setIntField(term88063, term88063.getClass(), "winCount", 863394391);
        setIntField(term88063, term88063.getClass(), "helpCount", -1464666900);
        setIntField(term88063, term88063.getClass(), "comboCount", 1514362336);
        setIntField(term88063, term88063.getClass(), "feverCount", -826362969);
        setIntField(term88063, term88063.getClass(), "totalHiScore", 1062563319);
        setIntField(term88063, term88063.getClass(), "totalEasyHighScore", 515240740);
        setIntField(term88063, term88063.getClass(), "totalBasicHighScore", -1221744120);
        setIntField(term88063, term88063.getClass(), "totalAdvancedHighScore", 1995800837);
        setIntField(term88063, term88063.getClass(), "totalExpertHighScore", -59523762);
        setIntField(term88063, term88063.getClass(), "totalMasterHighScore", 25345151);
        setIntField(term88063, term88063.getClass(), "totalReMasterHighScore", 651655016);
        setIntField(term88063, term88063.getClass(), "totalHighSync", -1388448851);
        setIntField(term88063, term88063.getClass(), "totalEasySync", -1565944347);
        setIntField(term88063, term88063.getClass(), "totalBasicSync", 20706388);
        setIntField(term88063, term88063.getClass(), "totalAdvancedSync", 836069699);
        setIntField(term88063, term88063.getClass(), "totalExpertSync", 1595274836);
        setIntField(term88063, term88063.getClass(), "totalMasterSync", 691227128);
        setIntField(term88063, term88063.getClass(), "totalReMasterSync", 1336238944);
        setIntField(term88063, term88063.getClass(), "playerRating", -523694473);
        setIntField(term88063, term88063.getClass(), "highestRating", 662814388);
        setIntField(term88063, term88063.getClass(), "rankAuthTailId", -988634792);
        setField(term88063, term88063.getClass(), "eventWatchedDate", "QsFsmwqvwM");
        setField(term88063, term88063.getClass(), "webLimitDate", "pSDSdAjceB");
        setIntField(term88063, term88063.getClass(), "challengeTrackPhase", -985800486);
        setIntField(term88063, term88063.getClass(), "firstPlayBits", 104926979);
        setField(term88063, term88063.getClass(), "lastPlayDate", "TGMaCYOqml");
        setIntField(term88063, term88063.getClass(), "lastPlaceId", 21442244);
        setField(term88063, term88063.getClass(), "lastPlaceName", "btqCBRPcNd");
        setIntField(term88063, term88063.getClass(), "lastRegionId", -644090733);
        setField(term88063, term88063.getClass(), "lastRegionName", "LEbiLyVKDG");
        setField(term88063, term88063.getClass(), "lastClientId", "PzUzEwZhUT");
        setField(term88063, term88063.getClass(), "lastCountryCode", "bJKvwEFeLG");
        setIntField(term88063, term88063.getClass(), "eventPoint", 1357265093);
        setIntField(term88063, term88063.getClass(), "totalLv", -383207990);
        setIntField(term88063, term88063.getClass(), "lastLoginBonusDay", 115447081);
        setIntField(term88063, term88063.getClass(), "lastSurvivalBonusDay", -1256761775);
        setIntField(term88063, term88063.getClass(), "loginBonusLv", -203447420);
        setField(term88061, term88061.getClass(), "user", term88063);
        setIntField(term88061, term88061.getClass(), "itemKind", -1006644586);
        setIntField(term88061, term88061.getClass(), "itemId", -1509130004);
        setIntField(term88061, term88061.getClass(), "stock", 2130734848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term88061, args);
    }

};


