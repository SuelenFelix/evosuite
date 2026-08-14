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
import java.util.LinkedList;

public class UserDetail_setCharaSlot_187911676195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249381;
     Object term249720;

    public UserDetail_setCharaSlot_187911676195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term249385 = new Long(-1365372122034008688L);
        ArrayList term249446 = new ArrayList();
        ArrayList term249450 = new ArrayList();
        term249381 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term249383 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term249399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249404 = newInstance(Class.forName("java.time.LocalTime"));
        Object term249409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249414 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term249381, term249381.getClass(), "id", -7453458891925935545L);
        setLongField(term249383, term249383.getClass(), "id", -2894327945659596082L);
        setField(term249383, term249383.getClass(), "extId", term249385);
        setField(term249383, term249383.getClass(), "luid", "aGJpzsREQk");
        setIntField(term249400, term249400.getClass(), "year", 2020);
        setShortField(term249400, term249400.getClass(), "month", (short) 5);
        setShortField(term249400, term249400.getClass(), "day", (short) 18);
        setField(term249399, term249399.getClass(), "date", term249400);
        setByteField(term249404, term249404.getClass(), "hour", (byte) 0);
        setByteField(term249404, term249404.getClass(), "minute", (byte) 6);
        setByteField(term249404, term249404.getClass(), "second", (byte) 7);
        setIntField(term249404, term249404.getClass(), "nano", 597786302);
        setField(term249399, term249399.getClass(), "time", term249404);
        setField(term249383, term249383.getClass(), "registerTime", term249399);
        setIntField(term249410, term249410.getClass(), "year", 2022);
        setShortField(term249410, term249410.getClass(), "month", (short) 10);
        setShortField(term249410, term249410.getClass(), "day", (short) 9);
        setField(term249409, term249409.getClass(), "date", term249410);
        setByteField(term249414, term249414.getClass(), "hour", (byte) 13);
        setByteField(term249414, term249414.getClass(), "minute", (byte) 29);
        setByteField(term249414, term249414.getClass(), "second", (byte) 0);
        setIntField(term249414, term249414.getClass(), "nano", 479809645);
        setField(term249409, term249409.getClass(), "time", term249414);
        setField(term249383, term249383.getClass(), "accessTime", term249409);
        setField(term249381, term249381.getClass(), "card", term249383);
        setField(term249381, term249381.getClass(), "userName", "yNmAFVlbsd");
        setIntField(term249381, term249381.getClass(), "isNetMember", -1615007560);
        setIntField(term249381, term249381.getClass(), "iconId", 1602440493);
        setIntField(term249381, term249381.getClass(), "plateId", -1350543710);
        setIntField(term249381, term249381.getClass(), "titleId", 1136111379);
        setIntField(term249381, term249381.getClass(), "partnerId", 741627966);
        setIntField(term249381, term249381.getClass(), "frameId", -1499573211);
        setIntField(term249381, term249381.getClass(), "selectMapId", 1648846611);
        setIntField(term249381, term249381.getClass(), "totalAwake", 802558149);
        setIntField(term249381, term249381.getClass(), "gradeRating", 551411019);
        setIntField(term249381, term249381.getClass(), "musicRating", -706249672);
        setIntField(term249381, term249381.getClass(), "playerRating", 899428484);
        setIntField(term249381, term249381.getClass(), "highestRating", -715619460);
        setIntField(term249381, term249381.getClass(), "gradeRank", -485599290);
        setIntField(term249381, term249381.getClass(), "classRank", 1782317150);
        setIntField(term249381, term249381.getClass(), "courseRank", 1609026911);
        setField(term249381, term249381.getClass(), "charaSlot", term249446);
        setField(term249381, term249381.getClass(), "charaLockSlot", term249450);
        setLongField(term249381, term249381.getClass(), "contentBit", 8785022794693424189L);
        setIntField(term249381, term249381.getClass(), "playCount", -1582731378);
        setField(term249381, term249381.getClass(), "eventWatchedDate", "OdpsFXVyHb");
        setField(term249381, term249381.getClass(), "lastGameId", "nJYYTNCMan");
        setField(term249381, term249381.getClass(), "lastRomVersion", "kfOHuUkyPD");
        setField(term249381, term249381.getClass(), "lastDataVersion", "dPfJJGqFNX");
        setField(term249381, term249381.getClass(), "lastLoginDate", "AcpKKvffPO");
        setField(term249381, term249381.getClass(), "lastPlayDate", "nxXgwkBjIn");
        setIntField(term249381, term249381.getClass(), "lastPlayCredit", -23903250);
        setIntField(term249381, term249381.getClass(), "lastPlayMode", 813666760);
        setIntField(term249381, term249381.getClass(), "lastPlaceId", -623763986);
        setField(term249381, term249381.getClass(), "lastPlaceName", "BlUKdVLBNm");
        setIntField(term249381, term249381.getClass(), "lastAllNetId", -1410336947);
        setIntField(term249381, term249381.getClass(), "lastRegionId", 1758202234);
        setField(term249381, term249381.getClass(), "lastRegionName", "CldhEgXvQf");
        setField(term249381, term249381.getClass(), "lastClientId", "WgctHDcsib");
        setField(term249381, term249381.getClass(), "lastCountryCode", "gIhnDwhYPA");
        setIntField(term249381, term249381.getClass(), "lastSelectEMoney", 1517943352);
        setIntField(term249381, term249381.getClass(), "lastSelectTicket", -488153567);
        setIntField(term249381, term249381.getClass(), "lastSelectCourse", -607202437);
        setIntField(term249381, term249381.getClass(), "lastCountCourse", 1290670338);
        setField(term249381, term249381.getClass(), "firstGameId", "CHKxCaDYeL");
        setField(term249381, term249381.getClass(), "firstRomVersion", "pltMgQSnCb");
        setField(term249381, term249381.getClass(), "firstDataVersion", "RiGoJoBvZO");
        setField(term249381, term249381.getClass(), "firstPlayDate", "xjNArFEvAJ");
        setField(term249381, term249381.getClass(), "compatibleCmVersion", "cNAlXBcuBR");
        setField(term249381, term249381.getClass(), "dailyBonusDate", "zhTrQcOfmZ");
        setField(term249381, term249381.getClass(), "dailyCourseBonusDate", "QPQvZYsKyp");
        setField(term249381, term249381.getClass(), "lastPairLoginDate", "DcKnNHFkHB");
        setField(term249381, term249381.getClass(), "lastTrialPlayDate", "ItJTfGujtZ");
        setIntField(term249381, term249381.getClass(), "playVsCount", 322703244);
        setIntField(term249381, term249381.getClass(), "playSyncCount", -1109732466);
        setIntField(term249381, term249381.getClass(), "winCount", 533725948);
        setIntField(term249381, term249381.getClass(), "helpCount", 162155421);
        setIntField(term249381, term249381.getClass(), "comboCount", 2041040026);
        setLongField(term249381, term249381.getClass(), "totalDeluxscore", 9101411277919493832L);
        setLongField(term249381, term249381.getClass(), "totalBasicDeluxscore", -5286983810679423857L);
        setLongField(term249381, term249381.getClass(), "totalAdvancedDeluxscore", -6862799947535614001L);
        setLongField(term249381, term249381.getClass(), "totalExpertDeluxscore", -5412219422543338505L);
        setLongField(term249381, term249381.getClass(), "totalMasterDeluxscore", -2696463570950532166L);
        setLongField(term249381, term249381.getClass(), "totalReMasterDeluxscore", -7345606601055439225L);
        setIntField(term249381, term249381.getClass(), "totalSync", 1748490168);
        setIntField(term249381, term249381.getClass(), "totalBasicSync", -542162483);
        setIntField(term249381, term249381.getClass(), "totalAdvancedSync", 45158602);
        setIntField(term249381, term249381.getClass(), "totalExpertSync", -1793023165);
        setIntField(term249381, term249381.getClass(), "totalMasterSync", 815973011);
        setIntField(term249381, term249381.getClass(), "totalReMasterSync", 325090101);
        setLongField(term249381, term249381.getClass(), "totalAchievement", 7624909926804505110L);
        setLongField(term249381, term249381.getClass(), "totalBasicAchievement", -5796968509989986067L);
        setLongField(term249381, term249381.getClass(), "totalAdvancedAchievement", -8801336988572685051L);
        setLongField(term249381, term249381.getClass(), "totalExpertAchievement", 8295970044702242296L);
        setLongField(term249381, term249381.getClass(), "totalMasterAchievement", 7565052942352604258L);
        setLongField(term249381, term249381.getClass(), "totalReMasterAchievement", 4229022575717795930L);
        setLongField(term249381, term249381.getClass(), "playerOldRating", -4861516848574302423L);
        setLongField(term249381, term249381.getClass(), "playerNewRating", -6097472804305560401L);
        setIntField(term249381, term249381.getClass(), "banState", -1728350573);
        setLongField(term249381, term249381.getClass(), "dateTime", -6773088308691751146L);
        term249720 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term249720;
        callMethod(klass, "setCharaSlot", argTypes, term249381, args);
    }

};


