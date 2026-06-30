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

public class UserDetail_setClassRank_185684118494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248278;
     Object term248645;

    public UserDetail_setClassRank_185684118494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term248282 = new Long(-1084263688306617320L);
        Integer term248345 = new Integer(-2056399026);
        Integer term248347 = new Integer(-150070327);
        Integer term248349 = new Integer(-731659931);
        Integer term248351 = new Integer(645238162);
        Integer term248353 = new Integer(-987757870);
        Integer term248355 = new Integer(2132585005);
        ArrayList term248343 = new ArrayList();
        ((ArrayList) term248343).add(term248345);
        ((ArrayList) term248343).add(term248347);
        ((ArrayList) term248343).add(term248349);
        ((ArrayList) term248343).add(term248351);
        ((ArrayList) term248343).add(term248353);
        ((ArrayList) term248343).add(term248355);
        Integer term248361 = new Integer(451557051);
        Integer term248363 = new Integer(71783796);
        Integer term248365 = new Integer(2085417929);
        Integer term248367 = new Integer(644887242);
        Integer term248369 = new Integer(1544325432);
        Integer term248371 = new Integer(908157389);
        Integer term248373 = new Integer(691619263);
        Integer term248375 = new Integer(637841150);
        ArrayList term248359 = new ArrayList();
        ((ArrayList) term248359).add(term248361);
        ((ArrayList) term248359).add(term248363);
        ((ArrayList) term248359).add(term248365);
        ((ArrayList) term248359).add(term248367);
        ((ArrayList) term248359).add(term248369);
        ((ArrayList) term248359).add(term248371);
        ((ArrayList) term248359).add(term248373);
        ((ArrayList) term248359).add(term248375);
        term248278 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term248280 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term248296 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248297 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248301 = newInstance(Class.forName("java.time.LocalTime"));
        Object term248306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248311 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term248278, term248278.getClass(), "id", 6725789230896961855L);
        setLongField(term248280, term248280.getClass(), "id", 6442701473624740679L);
        setField(term248280, term248280.getClass(), "extId", term248282);
        setField(term248280, term248280.getClass(), "luid", "osTjagfbhA");
        setIntField(term248297, term248297.getClass(), "year", 2025);
        setShortField(term248297, term248297.getClass(), "month", (short) 5);
        setShortField(term248297, term248297.getClass(), "day", (short) 29);
        setField(term248296, term248296.getClass(), "date", term248297);
        setByteField(term248301, term248301.getClass(), "hour", (byte) 14);
        setByteField(term248301, term248301.getClass(), "minute", (byte) 31);
        setByteField(term248301, term248301.getClass(), "second", (byte) 17);
        setIntField(term248301, term248301.getClass(), "nano", 808113660);
        setField(term248296, term248296.getClass(), "time", term248301);
        setField(term248280, term248280.getClass(), "registerTime", term248296);
        setIntField(term248307, term248307.getClass(), "year", 2029);
        setShortField(term248307, term248307.getClass(), "month", (short) 9);
        setShortField(term248307, term248307.getClass(), "day", (short) 22);
        setField(term248306, term248306.getClass(), "date", term248307);
        setByteField(term248311, term248311.getClass(), "hour", (byte) 9);
        setByteField(term248311, term248311.getClass(), "minute", (byte) 11);
        setByteField(term248311, term248311.getClass(), "second", (byte) 48);
        setIntField(term248311, term248311.getClass(), "nano", 904292704);
        setField(term248306, term248306.getClass(), "time", term248311);
        setField(term248280, term248280.getClass(), "accessTime", term248306);
        setField(term248278, term248278.getClass(), "card", term248280);
        setField(term248278, term248278.getClass(), "userName", "KVJHdKBMKb");
        setIntField(term248278, term248278.getClass(), "isNetMember", 756673805);
        setIntField(term248278, term248278.getClass(), "iconId", -1760100052);
        setIntField(term248278, term248278.getClass(), "plateId", 1162383395);
        setIntField(term248278, term248278.getClass(), "titleId", -1210112971);
        setIntField(term248278, term248278.getClass(), "partnerId", 635840720);
        setIntField(term248278, term248278.getClass(), "frameId", 601832303);
        setIntField(term248278, term248278.getClass(), "selectMapId", -399801159);
        setIntField(term248278, term248278.getClass(), "totalAwake", 1268354860);
        setIntField(term248278, term248278.getClass(), "gradeRating", 155248036);
        setIntField(term248278, term248278.getClass(), "musicRating", 2012721194);
        setIntField(term248278, term248278.getClass(), "playerRating", -699142829);
        setIntField(term248278, term248278.getClass(), "highestRating", 1672191044);
        setIntField(term248278, term248278.getClass(), "gradeRank", 805828930);
        setIntField(term248278, term248278.getClass(), "classRank", -2013090834);
        setIntField(term248278, term248278.getClass(), "courseRank", -759354449);
        setField(term248278, term248278.getClass(), "charaSlot", term248343);
        setField(term248278, term248278.getClass(), "charaLockSlot", term248359);
        setLongField(term248278, term248278.getClass(), "contentBit", -9201109031588522217L);
        setIntField(term248278, term248278.getClass(), "playCount", -434381369);
        setField(term248278, term248278.getClass(), "eventWatchedDate", "hrhwpRIDFJ");
        setField(term248278, term248278.getClass(), "lastGameId", "eanYvfnxqY");
        setField(term248278, term248278.getClass(), "lastRomVersion", "WHYzVTgpKa");
        setField(term248278, term248278.getClass(), "lastDataVersion", "RjzDomTTbS");
        setField(term248278, term248278.getClass(), "lastLoginDate", "pGIWKlGIzp");
        setField(term248278, term248278.getClass(), "lastPlayDate", "PUZgBUGBmS");
        setIntField(term248278, term248278.getClass(), "lastPlayCredit", -855023218);
        setIntField(term248278, term248278.getClass(), "lastPlayMode", -1033073975);
        setIntField(term248278, term248278.getClass(), "lastPlaceId", 709673310);
        setField(term248278, term248278.getClass(), "lastPlaceName", "xLEiWtPonE");
        setIntField(term248278, term248278.getClass(), "lastAllNetId", 1902388445);
        setIntField(term248278, term248278.getClass(), "lastRegionId", -168790792);
        setField(term248278, term248278.getClass(), "lastRegionName", "wyDaOmiffy");
        setField(term248278, term248278.getClass(), "lastClientId", "mzQSpyiDzE");
        setField(term248278, term248278.getClass(), "lastCountryCode", "CTXGUQuXhq");
        setIntField(term248278, term248278.getClass(), "lastSelectEMoney", 1242770139);
        setIntField(term248278, term248278.getClass(), "lastSelectTicket", 377426122);
        setIntField(term248278, term248278.getClass(), "lastSelectCourse", -48674750);
        setIntField(term248278, term248278.getClass(), "lastCountCourse", 220935460);
        setField(term248278, term248278.getClass(), "firstGameId", "MIyWzhVoWw");
        setField(term248278, term248278.getClass(), "firstRomVersion", "rWAlzFyhnR");
        setField(term248278, term248278.getClass(), "firstDataVersion", "LphHrPlrqn");
        setField(term248278, term248278.getClass(), "firstPlayDate", "qQfbGGlBUn");
        setField(term248278, term248278.getClass(), "compatibleCmVersion", "nulHgoDPRO");
        setField(term248278, term248278.getClass(), "dailyBonusDate", "jiQYJRpWWs");
        setField(term248278, term248278.getClass(), "dailyCourseBonusDate", "UaGWyukANs");
        setField(term248278, term248278.getClass(), "lastPairLoginDate", "XHgoSKsgYP");
        setField(term248278, term248278.getClass(), "lastTrialPlayDate", "iQPdAhoTek");
        setIntField(term248278, term248278.getClass(), "playVsCount", 2086237225);
        setIntField(term248278, term248278.getClass(), "playSyncCount", 1865460346);
        setIntField(term248278, term248278.getClass(), "winCount", -1698946504);
        setIntField(term248278, term248278.getClass(), "helpCount", 1409263564);
        setIntField(term248278, term248278.getClass(), "comboCount", -62191184);
        setLongField(term248278, term248278.getClass(), "totalDeluxscore", -809623053406068285L);
        setLongField(term248278, term248278.getClass(), "totalBasicDeluxscore", -472443514275498081L);
        setLongField(term248278, term248278.getClass(), "totalAdvancedDeluxscore", 2206381981371013379L);
        setLongField(term248278, term248278.getClass(), "totalExpertDeluxscore", -2399498275440260409L);
        setLongField(term248278, term248278.getClass(), "totalMasterDeluxscore", 5994662171699621795L);
        setLongField(term248278, term248278.getClass(), "totalReMasterDeluxscore", 4136533657716463569L);
        setIntField(term248278, term248278.getClass(), "totalSync", 274246292);
        setIntField(term248278, term248278.getClass(), "totalBasicSync", -473433665);
        setIntField(term248278, term248278.getClass(), "totalAdvancedSync", -853321243);
        setIntField(term248278, term248278.getClass(), "totalExpertSync", 1780578237);
        setIntField(term248278, term248278.getClass(), "totalMasterSync", 852290211);
        setIntField(term248278, term248278.getClass(), "totalReMasterSync", -492713212);
        setLongField(term248278, term248278.getClass(), "totalAchievement", 6501665028385517226L);
        setLongField(term248278, term248278.getClass(), "totalBasicAchievement", 4846208274662840851L);
        setLongField(term248278, term248278.getClass(), "totalAdvancedAchievement", 6234067722949346799L);
        setLongField(term248278, term248278.getClass(), "totalExpertAchievement", 4337206851721971194L);
        setLongField(term248278, term248278.getClass(), "totalMasterAchievement", -2641408538515668296L);
        setLongField(term248278, term248278.getClass(), "totalReMasterAchievement", 7803645234880158290L);
        setLongField(term248278, term248278.getClass(), "playerOldRating", 1430208667127778467L);
        setLongField(term248278, term248278.getClass(), "playerNewRating", -619135166800870973L);
        setIntField(term248278, term248278.getClass(), "banState", -928681728);
        setLongField(term248278, term248278.getClass(), "dateTime", -6520640966747304759L);
        term248645 = new Integer(29193083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term248645;
        callMethod(klass, "setClassRank", argTypes, term248278, args);
    }

};


