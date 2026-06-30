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

public class UserUdemae_setNpcLoseNum_127382882636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116042;
     Object term116415;

    public UserUdemae_setNpcLoseNum_127382882636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116048 = new Long(-6673920710396545553L);
        Integer term116111 = new Integer(-1510967747);
        Integer term116113 = new Integer(-2014792457);
        Integer term116115 = new Integer(1957633116);
        ArrayList term116109 = new ArrayList();
        ((ArrayList) term116109).add(term116111);
        ((ArrayList) term116109).add(term116113);
        ((ArrayList) term116109).add(term116115);
        Integer term116121 = new Integer(1428598210);
        Integer term116123 = new Integer(1071776561);
        Integer term116125 = new Integer(1846399918);
        Integer term116127 = new Integer(35388821);
        Integer term116129 = new Integer(-598803400);
        ArrayList term116119 = new ArrayList();
        ((ArrayList) term116119).add(term116121);
        ((ArrayList) term116119).add(term116123);
        ((ArrayList) term116119).add(term116125);
        ((ArrayList) term116119).add(term116127);
        ((ArrayList) term116119).add(term116129);
        term116042 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term116044 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term116046 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term116062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116067 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116077 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term116042, term116042.getClass(), "id", -7893702611376690699L);
        setLongField(term116044, term116044.getClass(), "id", 665607857695451113L);
        setLongField(term116046, term116046.getClass(), "id", -6992013352199756588L);
        setField(term116046, term116046.getClass(), "extId", term116048);
        setField(term116046, term116046.getClass(), "luid", "KPnQVYAkIf");
        setIntField(term116063, term116063.getClass(), "year", 2024);
        setShortField(term116063, term116063.getClass(), "month", (short) 11);
        setShortField(term116063, term116063.getClass(), "day", (short) 26);
        setField(term116062, term116062.getClass(), "date", term116063);
        setByteField(term116067, term116067.getClass(), "hour", (byte) 3);
        setByteField(term116067, term116067.getClass(), "minute", (byte) 8);
        setByteField(term116067, term116067.getClass(), "second", (byte) 47);
        setIntField(term116067, term116067.getClass(), "nano", 559634968);
        setField(term116062, term116062.getClass(), "time", term116067);
        setField(term116046, term116046.getClass(), "registerTime", term116062);
        setIntField(term116073, term116073.getClass(), "year", 2018);
        setShortField(term116073, term116073.getClass(), "month", (short) 4);
        setShortField(term116073, term116073.getClass(), "day", (short) 20);
        setField(term116072, term116072.getClass(), "date", term116073);
        setByteField(term116077, term116077.getClass(), "hour", (byte) 16);
        setByteField(term116077, term116077.getClass(), "minute", (byte) 13);
        setByteField(term116077, term116077.getClass(), "second", (byte) 15);
        setIntField(term116077, term116077.getClass(), "nano", 195741881);
        setField(term116072, term116072.getClass(), "time", term116077);
        setField(term116046, term116046.getClass(), "accessTime", term116072);
        setField(term116044, term116044.getClass(), "card", term116046);
        setField(term116044, term116044.getClass(), "userName", "BrYcEZSDFU");
        setIntField(term116044, term116044.getClass(), "isNetMember", 1410893442);
        setIntField(term116044, term116044.getClass(), "iconId", -1557544397);
        setIntField(term116044, term116044.getClass(), "plateId", 1050498492);
        setIntField(term116044, term116044.getClass(), "titleId", -14998881);
        setIntField(term116044, term116044.getClass(), "partnerId", 1913259662);
        setIntField(term116044, term116044.getClass(), "frameId", -181084778);
        setIntField(term116044, term116044.getClass(), "selectMapId", -558822921);
        setIntField(term116044, term116044.getClass(), "totalAwake", -445796317);
        setIntField(term116044, term116044.getClass(), "gradeRating", -75307754);
        setIntField(term116044, term116044.getClass(), "musicRating", 1208875748);
        setIntField(term116044, term116044.getClass(), "playerRating", -353170573);
        setIntField(term116044, term116044.getClass(), "highestRating", -1071939679);
        setIntField(term116044, term116044.getClass(), "gradeRank", -1530369051);
        setIntField(term116044, term116044.getClass(), "classRank", -538048936);
        setIntField(term116044, term116044.getClass(), "courseRank", 359927439);
        setField(term116044, term116044.getClass(), "charaSlot", term116109);
        setField(term116044, term116044.getClass(), "charaLockSlot", term116119);
        setLongField(term116044, term116044.getClass(), "contentBit", -4792083559351629166L);
        setIntField(term116044, term116044.getClass(), "playCount", -671786602);
        setField(term116044, term116044.getClass(), "eventWatchedDate", "fXhQVbntXX");
        setField(term116044, term116044.getClass(), "lastGameId", "GdsYFhpAsv");
        setField(term116044, term116044.getClass(), "lastRomVersion", "JyeOfYxCgA");
        setField(term116044, term116044.getClass(), "lastDataVersion", "yICoZygmis");
        setField(term116044, term116044.getClass(), "lastLoginDate", "jkpqjRyuQn");
        setField(term116044, term116044.getClass(), "lastPlayDate", "VyUAUXqMnJ");
        setIntField(term116044, term116044.getClass(), "lastPlayCredit", -51390011);
        setIntField(term116044, term116044.getClass(), "lastPlayMode", 1988464734);
        setIntField(term116044, term116044.getClass(), "lastPlaceId", 1205484765);
        setField(term116044, term116044.getClass(), "lastPlaceName", "kpIzuOxHoi");
        setIntField(term116044, term116044.getClass(), "lastAllNetId", 1721773044);
        setIntField(term116044, term116044.getClass(), "lastRegionId", -915969228);
        setField(term116044, term116044.getClass(), "lastRegionName", "HnyxpTbQyj");
        setField(term116044, term116044.getClass(), "lastClientId", "jCoeBTGJOl");
        setField(term116044, term116044.getClass(), "lastCountryCode", "RpcnPMoqQP");
        setIntField(term116044, term116044.getClass(), "lastSelectEMoney", 1880570421);
        setIntField(term116044, term116044.getClass(), "lastSelectTicket", 1550634740);
        setIntField(term116044, term116044.getClass(), "lastSelectCourse", 1948909933);
        setIntField(term116044, term116044.getClass(), "lastCountCourse", 523942487);
        setField(term116044, term116044.getClass(), "firstGameId", "rcSNzDRILu");
        setField(term116044, term116044.getClass(), "firstRomVersion", "VAFzJeEFAQ");
        setField(term116044, term116044.getClass(), "firstDataVersion", "yqhryWPaPb");
        setField(term116044, term116044.getClass(), "firstPlayDate", "TBvkESDYGc");
        setField(term116044, term116044.getClass(), "compatibleCmVersion", "xPXaeMXfJb");
        setField(term116044, term116044.getClass(), "dailyBonusDate", "ujCcQbAWoz");
        setField(term116044, term116044.getClass(), "dailyCourseBonusDate", "gJKBShUpxP");
        setField(term116044, term116044.getClass(), "lastPairLoginDate", "AgLTAjLwXk");
        setField(term116044, term116044.getClass(), "lastTrialPlayDate", "INoAjOhMEq");
        setIntField(term116044, term116044.getClass(), "playVsCount", 414828751);
        setIntField(term116044, term116044.getClass(), "playSyncCount", -1302401149);
        setIntField(term116044, term116044.getClass(), "winCount", -245323536);
        setIntField(term116044, term116044.getClass(), "helpCount", 1512614447);
        setIntField(term116044, term116044.getClass(), "comboCount", 1978532347);
        setLongField(term116044, term116044.getClass(), "totalDeluxscore", -865520563203189439L);
        setLongField(term116044, term116044.getClass(), "totalBasicDeluxscore", 943353555627069347L);
        setLongField(term116044, term116044.getClass(), "totalAdvancedDeluxscore", 6265344567302607504L);
        setLongField(term116044, term116044.getClass(), "totalExpertDeluxscore", 7538755489771520951L);
        setLongField(term116044, term116044.getClass(), "totalMasterDeluxscore", 7535903882054995964L);
        setLongField(term116044, term116044.getClass(), "totalReMasterDeluxscore", 7098896161393358891L);
        setIntField(term116044, term116044.getClass(), "totalSync", 612187049);
        setIntField(term116044, term116044.getClass(), "totalBasicSync", -965947021);
        setIntField(term116044, term116044.getClass(), "totalAdvancedSync", 1079005450);
        setIntField(term116044, term116044.getClass(), "totalExpertSync", -1932347451);
        setIntField(term116044, term116044.getClass(), "totalMasterSync", -406686588);
        setIntField(term116044, term116044.getClass(), "totalReMasterSync", 1008508403);
        setLongField(term116044, term116044.getClass(), "totalAchievement", 956005912516954859L);
        setLongField(term116044, term116044.getClass(), "totalBasicAchievement", -3807584648232803070L);
        setLongField(term116044, term116044.getClass(), "totalAdvancedAchievement", -4029489396713416331L);
        setLongField(term116044, term116044.getClass(), "totalExpertAchievement", -3218047049129179895L);
        setLongField(term116044, term116044.getClass(), "totalMasterAchievement", 7259331600733986087L);
        setLongField(term116044, term116044.getClass(), "totalReMasterAchievement", -6438807154292944837L);
        setLongField(term116044, term116044.getClass(), "playerOldRating", -6248422485077615101L);
        setLongField(term116044, term116044.getClass(), "playerNewRating", -7827710808655071130L);
        setIntField(term116044, term116044.getClass(), "banState", -1013082565);
        setLongField(term116044, term116044.getClass(), "dateTime", -3130570931908226613L);
        setField(term116042, term116042.getClass(), "user", term116044);
        setIntField(term116042, term116042.getClass(), "rate", -855398884);
        setIntField(term116042, term116042.getClass(), "maxRate", -762497528);
        setIntField(term116042, term116042.getClass(), "classValue", -210438728);
        setIntField(term116042, term116042.getClass(), "maxClassValue", -277514484);
        setIntField(term116042, term116042.getClass(), "totalWinNum", 836110005);
        setIntField(term116042, term116042.getClass(), "totalLoseNum", -25573615);
        setIntField(term116042, term116042.getClass(), "maxWinNum", -1429138211);
        setIntField(term116042, term116042.getClass(), "maxLoseNum", -458414349);
        setIntField(term116042, term116042.getClass(), "winNum", 1500512047);
        setIntField(term116042, term116042.getClass(), "loseNum", 1803572922);
        setIntField(term116042, term116042.getClass(), "npcTotalWinNum", 1045176591);
        setIntField(term116042, term116042.getClass(), "npcTotalLoseNum", -19497212);
        setIntField(term116042, term116042.getClass(), "npcMaxWinNum", 1768312184);
        setIntField(term116042, term116042.getClass(), "npcMaxLoseNum", -1540801809);
        setIntField(term116042, term116042.getClass(), "npcWinNum", -1968650604);
        setIntField(term116042, term116042.getClass(), "npcLoseNum", -1080069977);
        term116415 = new Integer(-581052818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term116415;
        callMethod(klass, "setNpcLoseNum", argTypes, term116042, args);
    }

};


