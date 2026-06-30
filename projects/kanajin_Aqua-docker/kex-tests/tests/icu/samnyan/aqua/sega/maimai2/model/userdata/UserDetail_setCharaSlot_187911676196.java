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

public class UserDetail_setCharaSlot_187911676196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249436;
     Object term249775;

    public UserDetail_setCharaSlot_187911676196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term249440 = new Long(-1365372122034008688L);
        ArrayList term249501 = new ArrayList();
        ArrayList term249505 = new ArrayList();
        term249436 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term249438 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term249454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term249464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249469 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term249436, term249436.getClass(), "id", -7453458891925935545L);
        setLongField(term249438, term249438.getClass(), "id", -2894327945659596082L);
        setField(term249438, term249438.getClass(), "extId", term249440);
        setField(term249438, term249438.getClass(), "luid", "aGJpzsREQk");
        setIntField(term249455, term249455.getClass(), "year", 2020);
        setShortField(term249455, term249455.getClass(), "month", (short) 5);
        setShortField(term249455, term249455.getClass(), "day", (short) 18);
        setField(term249454, term249454.getClass(), "date", term249455);
        setByteField(term249459, term249459.getClass(), "hour", (byte) 0);
        setByteField(term249459, term249459.getClass(), "minute", (byte) 6);
        setByteField(term249459, term249459.getClass(), "second", (byte) 7);
        setIntField(term249459, term249459.getClass(), "nano", 597786302);
        setField(term249454, term249454.getClass(), "time", term249459);
        setField(term249438, term249438.getClass(), "registerTime", term249454);
        setIntField(term249465, term249465.getClass(), "year", 2022);
        setShortField(term249465, term249465.getClass(), "month", (short) 10);
        setShortField(term249465, term249465.getClass(), "day", (short) 9);
        setField(term249464, term249464.getClass(), "date", term249465);
        setByteField(term249469, term249469.getClass(), "hour", (byte) 13);
        setByteField(term249469, term249469.getClass(), "minute", (byte) 29);
        setByteField(term249469, term249469.getClass(), "second", (byte) 0);
        setIntField(term249469, term249469.getClass(), "nano", 479809645);
        setField(term249464, term249464.getClass(), "time", term249469);
        setField(term249438, term249438.getClass(), "accessTime", term249464);
        setField(term249436, term249436.getClass(), "card", term249438);
        setField(term249436, term249436.getClass(), "userName", "yNmAFVlbsd");
        setIntField(term249436, term249436.getClass(), "isNetMember", -1615007560);
        setIntField(term249436, term249436.getClass(), "iconId", 1602440493);
        setIntField(term249436, term249436.getClass(), "plateId", -1350543710);
        setIntField(term249436, term249436.getClass(), "titleId", 1136111379);
        setIntField(term249436, term249436.getClass(), "partnerId", 741627966);
        setIntField(term249436, term249436.getClass(), "frameId", -1499573211);
        setIntField(term249436, term249436.getClass(), "selectMapId", 1648846611);
        setIntField(term249436, term249436.getClass(), "totalAwake", 802558149);
        setIntField(term249436, term249436.getClass(), "gradeRating", 551411019);
        setIntField(term249436, term249436.getClass(), "musicRating", -706249672);
        setIntField(term249436, term249436.getClass(), "playerRating", 899428484);
        setIntField(term249436, term249436.getClass(), "highestRating", -715619460);
        setIntField(term249436, term249436.getClass(), "gradeRank", -485599290);
        setIntField(term249436, term249436.getClass(), "classRank", 1782317150);
        setIntField(term249436, term249436.getClass(), "courseRank", 1609026911);
        setField(term249436, term249436.getClass(), "charaSlot", term249501);
        setField(term249436, term249436.getClass(), "charaLockSlot", term249505);
        setLongField(term249436, term249436.getClass(), "contentBit", 8785022794693424189L);
        setIntField(term249436, term249436.getClass(), "playCount", -1582731378);
        setField(term249436, term249436.getClass(), "eventWatchedDate", "OdpsFXVyHb");
        setField(term249436, term249436.getClass(), "lastGameId", "nJYYTNCMan");
        setField(term249436, term249436.getClass(), "lastRomVersion", "kfOHuUkyPD");
        setField(term249436, term249436.getClass(), "lastDataVersion", "dPfJJGqFNX");
        setField(term249436, term249436.getClass(), "lastLoginDate", "AcpKKvffPO");
        setField(term249436, term249436.getClass(), "lastPlayDate", "nxXgwkBjIn");
        setIntField(term249436, term249436.getClass(), "lastPlayCredit", -23903250);
        setIntField(term249436, term249436.getClass(), "lastPlayMode", 813666760);
        setIntField(term249436, term249436.getClass(), "lastPlaceId", -623763986);
        setField(term249436, term249436.getClass(), "lastPlaceName", "BlUKdVLBNm");
        setIntField(term249436, term249436.getClass(), "lastAllNetId", -1410336947);
        setIntField(term249436, term249436.getClass(), "lastRegionId", 1758202234);
        setField(term249436, term249436.getClass(), "lastRegionName", "CldhEgXvQf");
        setField(term249436, term249436.getClass(), "lastClientId", "WgctHDcsib");
        setField(term249436, term249436.getClass(), "lastCountryCode", "gIhnDwhYPA");
        setIntField(term249436, term249436.getClass(), "lastSelectEMoney", 1517943352);
        setIntField(term249436, term249436.getClass(), "lastSelectTicket", -488153567);
        setIntField(term249436, term249436.getClass(), "lastSelectCourse", -607202437);
        setIntField(term249436, term249436.getClass(), "lastCountCourse", 1290670338);
        setField(term249436, term249436.getClass(), "firstGameId", "CHKxCaDYeL");
        setField(term249436, term249436.getClass(), "firstRomVersion", "pltMgQSnCb");
        setField(term249436, term249436.getClass(), "firstDataVersion", "RiGoJoBvZO");
        setField(term249436, term249436.getClass(), "firstPlayDate", "xjNArFEvAJ");
        setField(term249436, term249436.getClass(), "compatibleCmVersion", "cNAlXBcuBR");
        setField(term249436, term249436.getClass(), "dailyBonusDate", "zhTrQcOfmZ");
        setField(term249436, term249436.getClass(), "dailyCourseBonusDate", "QPQvZYsKyp");
        setField(term249436, term249436.getClass(), "lastPairLoginDate", "DcKnNHFkHB");
        setField(term249436, term249436.getClass(), "lastTrialPlayDate", "ItJTfGujtZ");
        setIntField(term249436, term249436.getClass(), "playVsCount", 322703244);
        setIntField(term249436, term249436.getClass(), "playSyncCount", -1109732466);
        setIntField(term249436, term249436.getClass(), "winCount", 533725948);
        setIntField(term249436, term249436.getClass(), "helpCount", 162155421);
        setIntField(term249436, term249436.getClass(), "comboCount", 2041040026);
        setLongField(term249436, term249436.getClass(), "totalDeluxscore", 9101411277919493832L);
        setLongField(term249436, term249436.getClass(), "totalBasicDeluxscore", -5286983810679423857L);
        setLongField(term249436, term249436.getClass(), "totalAdvancedDeluxscore", -6862799947535614001L);
        setLongField(term249436, term249436.getClass(), "totalExpertDeluxscore", -5412219422543338505L);
        setLongField(term249436, term249436.getClass(), "totalMasterDeluxscore", -2696463570950532166L);
        setLongField(term249436, term249436.getClass(), "totalReMasterDeluxscore", -7345606601055439225L);
        setIntField(term249436, term249436.getClass(), "totalSync", 1748490168);
        setIntField(term249436, term249436.getClass(), "totalBasicSync", -542162483);
        setIntField(term249436, term249436.getClass(), "totalAdvancedSync", 45158602);
        setIntField(term249436, term249436.getClass(), "totalExpertSync", -1793023165);
        setIntField(term249436, term249436.getClass(), "totalMasterSync", 815973011);
        setIntField(term249436, term249436.getClass(), "totalReMasterSync", 325090101);
        setLongField(term249436, term249436.getClass(), "totalAchievement", 7624909926804505110L);
        setLongField(term249436, term249436.getClass(), "totalBasicAchievement", -5796968509989986067L);
        setLongField(term249436, term249436.getClass(), "totalAdvancedAchievement", -8801336988572685051L);
        setLongField(term249436, term249436.getClass(), "totalExpertAchievement", 8295970044702242296L);
        setLongField(term249436, term249436.getClass(), "totalMasterAchievement", 7565052942352604258L);
        setLongField(term249436, term249436.getClass(), "totalReMasterAchievement", 4229022575717795930L);
        setLongField(term249436, term249436.getClass(), "playerOldRating", -4861516848574302423L);
        setLongField(term249436, term249436.getClass(), "playerNewRating", -6097472804305560401L);
        setIntField(term249436, term249436.getClass(), "banState", -1728350573);
        setLongField(term249436, term249436.getClass(), "dateTime", -6773088308691751146L);
        term249775 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term249775;
        callMethod(klass, "setCharaSlot", argTypes, term249436, args);
    }

};


