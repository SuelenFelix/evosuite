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

public class UserDetail_getCharaLockSlot_186903456419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4240269;

    public UserDetail_getCharaLockSlot_186903456419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4240273 = new Long(88933260114356547L);
        Integer term4240336 = new Integer(1084937078);
        ArrayList term4240334 = new ArrayList();
        ((ArrayList) term4240334).add(term4240336);
        Integer term4240342 = new Integer(1895908546);
        Integer term4240344 = new Integer(-1334535627);
        Integer term4240346 = new Integer(-1899505891);
        ArrayList term4240340 = new ArrayList();
        ((ArrayList) term4240340).add(term4240342);
        ((ArrayList) term4240340).add(term4240344);
        ((ArrayList) term4240340).add(term4240346);
        term4240269 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4240271 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4240287 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4240288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4240292 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4240297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4240298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4240302 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4240269, term4240269.getClass(), "id", 8161658246272692434L);
        setLongField(term4240271, term4240271.getClass(), "id", 7414440943119110212L);
        setField(term4240271, term4240271.getClass(), "extId", term4240273);
        setField(term4240271, term4240271.getClass(), "luid", "bsMmcmvVHf");
        setIntField(term4240288, term4240288.getClass(), "year", 2010);
        setShortField(term4240288, term4240288.getClass(), "month", (short) 6);
        setShortField(term4240288, term4240288.getClass(), "day", (short) 18);
        setField(term4240287, term4240287.getClass(), "date", term4240288);
        setByteField(term4240292, term4240292.getClass(), "hour", (byte) 16);
        setByteField(term4240292, term4240292.getClass(), "minute", (byte) 31);
        setByteField(term4240292, term4240292.getClass(), "second", (byte) 47);
        setIntField(term4240292, term4240292.getClass(), "nano", 248585782);
        setField(term4240287, term4240287.getClass(), "time", term4240292);
        setField(term4240271, term4240271.getClass(), "registerTime", term4240287);
        setIntField(term4240298, term4240298.getClass(), "year", 2029);
        setShortField(term4240298, term4240298.getClass(), "month", (short) 1);
        setShortField(term4240298, term4240298.getClass(), "day", (short) 4);
        setField(term4240297, term4240297.getClass(), "date", term4240298);
        setByteField(term4240302, term4240302.getClass(), "hour", (byte) 16);
        setByteField(term4240302, term4240302.getClass(), "minute", (byte) 26);
        setByteField(term4240302, term4240302.getClass(), "second", (byte) 7);
        setIntField(term4240302, term4240302.getClass(), "nano", 529524434);
        setField(term4240297, term4240297.getClass(), "time", term4240302);
        setField(term4240271, term4240271.getClass(), "accessTime", term4240297);
        setField(term4240269, term4240269.getClass(), "card", term4240271);
        setField(term4240269, term4240269.getClass(), "userName", "AFjzloqEHo");
        setIntField(term4240269, term4240269.getClass(), "isNetMember", -830355653);
        setIntField(term4240269, term4240269.getClass(), "iconId", 86762359);
        setIntField(term4240269, term4240269.getClass(), "plateId", 1014253301);
        setIntField(term4240269, term4240269.getClass(), "titleId", 1695528542);
        setIntField(term4240269, term4240269.getClass(), "partnerId", 688442462);
        setIntField(term4240269, term4240269.getClass(), "frameId", -841117511);
        setIntField(term4240269, term4240269.getClass(), "selectMapId", 811106069);
        setIntField(term4240269, term4240269.getClass(), "totalAwake", -518247817);
        setIntField(term4240269, term4240269.getClass(), "gradeRating", 366739073);
        setIntField(term4240269, term4240269.getClass(), "musicRating", 1047508814);
        setIntField(term4240269, term4240269.getClass(), "playerRating", 885875966);
        setIntField(term4240269, term4240269.getClass(), "highestRating", 1571782362);
        setIntField(term4240269, term4240269.getClass(), "gradeRank", -282639413);
        setIntField(term4240269, term4240269.getClass(), "classRank", 82730648);
        setIntField(term4240269, term4240269.getClass(), "courseRank", 2057132489);
        setField(term4240269, term4240269.getClass(), "charaSlot", term4240334);
        setField(term4240269, term4240269.getClass(), "charaLockSlot", term4240340);
        setLongField(term4240269, term4240269.getClass(), "contentBit", -4994975023179551335L);
        setIntField(term4240269, term4240269.getClass(), "playCount", 447218478);
        setField(term4240269, term4240269.getClass(), "eventWatchedDate", "mALhtxJrdx");
        setField(term4240269, term4240269.getClass(), "lastGameId", "YGKGTSVAyT");
        setField(term4240269, term4240269.getClass(), "lastRomVersion", "sKUNcgAZuO");
        setField(term4240269, term4240269.getClass(), "lastDataVersion", "xgiPQaBlXb");
        setField(term4240269, term4240269.getClass(), "lastLoginDate", "bYtKpOFHNF");
        setField(term4240269, term4240269.getClass(), "lastPlayDate", "GfEZYHESiO");
        setIntField(term4240269, term4240269.getClass(), "lastPlayCredit", 724494924);
        setIntField(term4240269, term4240269.getClass(), "lastPlayMode", -1048172383);
        setIntField(term4240269, term4240269.getClass(), "lastPlaceId", 232558219);
        setField(term4240269, term4240269.getClass(), "lastPlaceName", "xqdjOXuLgj");
        setIntField(term4240269, term4240269.getClass(), "lastAllNetId", -1574560405);
        setIntField(term4240269, term4240269.getClass(), "lastRegionId", 596996980);
        setField(term4240269, term4240269.getClass(), "lastRegionName", "bkChygHZbS");
        setField(term4240269, term4240269.getClass(), "lastClientId", "DqlFWzJQHP");
        setField(term4240269, term4240269.getClass(), "lastCountryCode", "EJYNCuyRrU");
        setIntField(term4240269, term4240269.getClass(), "lastSelectEMoney", -1158272380);
        setIntField(term4240269, term4240269.getClass(), "lastSelectTicket", 654049004);
        setIntField(term4240269, term4240269.getClass(), "lastSelectCourse", -1288572188);
        setIntField(term4240269, term4240269.getClass(), "lastCountCourse", 460202696);
        setField(term4240269, term4240269.getClass(), "firstGameId", "RuuKSNtvCS");
        setField(term4240269, term4240269.getClass(), "firstRomVersion", "pGGNvSchnA");
        setField(term4240269, term4240269.getClass(), "firstDataVersion", "KRRcOBuOyX");
        setField(term4240269, term4240269.getClass(), "firstPlayDate", "KxdHcZIaNX");
        setField(term4240269, term4240269.getClass(), "compatibleCmVersion", "zeLZgPbhnS");
        setField(term4240269, term4240269.getClass(), "dailyBonusDate", "qOfDhylOnQ");
        setField(term4240269, term4240269.getClass(), "dailyCourseBonusDate", "zGIjAuNwax");
        setField(term4240269, term4240269.getClass(), "lastPairLoginDate", "rIVhJJsgha");
        setField(term4240269, term4240269.getClass(), "lastTrialPlayDate", "jjKcksJIeX");
        setIntField(term4240269, term4240269.getClass(), "playVsCount", -962828533);
        setIntField(term4240269, term4240269.getClass(), "playSyncCount", 1970864378);
        setIntField(term4240269, term4240269.getClass(), "winCount", 958668167);
        setIntField(term4240269, term4240269.getClass(), "helpCount", -1134738478);
        setIntField(term4240269, term4240269.getClass(), "comboCount", -1560490087);
        setLongField(term4240269, term4240269.getClass(), "totalDeluxscore", -2674605354176439469L);
        setLongField(term4240269, term4240269.getClass(), "totalBasicDeluxscore", 4014384826448902842L);
        setLongField(term4240269, term4240269.getClass(), "totalAdvancedDeluxscore", 2687597354378176725L);
        setLongField(term4240269, term4240269.getClass(), "totalExpertDeluxscore", 4182757255611095736L);
        setLongField(term4240269, term4240269.getClass(), "totalMasterDeluxscore", -6773494036982433612L);
        setLongField(term4240269, term4240269.getClass(), "totalReMasterDeluxscore", -2177354480323136402L);
        setIntField(term4240269, term4240269.getClass(), "totalSync", -2141880774);
        setIntField(term4240269, term4240269.getClass(), "totalBasicSync", 1485697380);
        setIntField(term4240269, term4240269.getClass(), "totalAdvancedSync", -777888936);
        setIntField(term4240269, term4240269.getClass(), "totalExpertSync", 926740298);
        setIntField(term4240269, term4240269.getClass(), "totalMasterSync", -961402368);
        setIntField(term4240269, term4240269.getClass(), "totalReMasterSync", -886958485);
        setLongField(term4240269, term4240269.getClass(), "totalAchievement", -6431456997792105493L);
        setLongField(term4240269, term4240269.getClass(), "totalBasicAchievement", 6179668743657020430L);
        setLongField(term4240269, term4240269.getClass(), "totalAdvancedAchievement", 2658169488231427876L);
        setLongField(term4240269, term4240269.getClass(), "totalExpertAchievement", 544358333275711591L);
        setLongField(term4240269, term4240269.getClass(), "totalMasterAchievement", 7103077519308569506L);
        setLongField(term4240269, term4240269.getClass(), "totalReMasterAchievement", 8765272227994654821L);
        setLongField(term4240269, term4240269.getClass(), "playerOldRating", 7183482194541937249L);
        setLongField(term4240269, term4240269.getClass(), "playerNewRating", -3280515446769775394L);
        setIntField(term4240269, term4240269.getClass(), "banState", 485996497);
        setLongField(term4240269, term4240269.getClass(), "dateTime", 7340220636703192443L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaLockSlot", argTypes, term4240269, args);
    }

};


