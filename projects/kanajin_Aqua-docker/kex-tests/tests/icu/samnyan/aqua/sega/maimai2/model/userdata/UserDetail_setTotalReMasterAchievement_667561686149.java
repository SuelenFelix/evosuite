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

public class UserDetail_setTotalReMasterAchievement_667561686149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280427;
     Object term280800;

    public UserDetail_setTotalReMasterAchievement_667561686149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term280431 = new Long(-7589547201844161961L);
        Integer term280494 = new Integer(-678230923);
        Integer term280496 = new Integer(2001978730);
        Integer term280498 = new Integer(835522995);
        Integer term280500 = new Integer(209416345);
        Integer term280502 = new Integer(119693843);
        Integer term280504 = new Integer(1525937366);
        Integer term280506 = new Integer(450142186);
        Integer term280508 = new Integer(874917656);
        Integer term280510 = new Integer(998050776);
        ArrayList term280492 = new ArrayList();
        ((ArrayList) term280492).add(term280494);
        ((ArrayList) term280492).add(term280496);
        ((ArrayList) term280492).add(term280498);
        ((ArrayList) term280492).add(term280500);
        ((ArrayList) term280492).add(term280502);
        ((ArrayList) term280492).add(term280504);
        ((ArrayList) term280492).add(term280506);
        ((ArrayList) term280492).add(term280508);
        ((ArrayList) term280492).add(term280510);
        Integer term280516 = new Integer(-1154360532);
        Integer term280518 = new Integer(-1414782360);
        Integer term280520 = new Integer(812774787);
        Integer term280522 = new Integer(1955108847);
        Integer term280524 = new Integer(601282140);
        Integer term280526 = new Integer(-1989711686);
        Integer term280528 = new Integer(-427352130);
        Integer term280530 = new Integer(490225359);
        ArrayList term280514 = new ArrayList();
        ((ArrayList) term280514).add(term280516);
        ((ArrayList) term280514).add(term280518);
        ((ArrayList) term280514).add(term280520);
        ((ArrayList) term280514).add(term280522);
        ((ArrayList) term280514).add(term280524);
        ((ArrayList) term280514).add(term280526);
        ((ArrayList) term280514).add(term280528);
        ((ArrayList) term280514).add(term280530);
        term280427 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term280429 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term280445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280460 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term280427, term280427.getClass(), "id", -5882399806153214183L);
        setLongField(term280429, term280429.getClass(), "id", 8851351187127807528L);
        setField(term280429, term280429.getClass(), "extId", term280431);
        setField(term280429, term280429.getClass(), "luid", "BybNDgOqaU");
        setIntField(term280446, term280446.getClass(), "year", 2017);
        setShortField(term280446, term280446.getClass(), "month", (short) 2);
        setShortField(term280446, term280446.getClass(), "day", (short) 5);
        setField(term280445, term280445.getClass(), "date", term280446);
        setByteField(term280450, term280450.getClass(), "hour", (byte) 21);
        setByteField(term280450, term280450.getClass(), "minute", (byte) 39);
        setByteField(term280450, term280450.getClass(), "second", (byte) 40);
        setIntField(term280450, term280450.getClass(), "nano", 124450071);
        setField(term280445, term280445.getClass(), "time", term280450);
        setField(term280429, term280429.getClass(), "registerTime", term280445);
        setIntField(term280456, term280456.getClass(), "year", 2017);
        setShortField(term280456, term280456.getClass(), "month", (short) 12);
        setShortField(term280456, term280456.getClass(), "day", (short) 4);
        setField(term280455, term280455.getClass(), "date", term280456);
        setByteField(term280460, term280460.getClass(), "hour", (byte) 17);
        setByteField(term280460, term280460.getClass(), "minute", (byte) 31);
        setByteField(term280460, term280460.getClass(), "second", (byte) 26);
        setIntField(term280460, term280460.getClass(), "nano", 462103828);
        setField(term280455, term280455.getClass(), "time", term280460);
        setField(term280429, term280429.getClass(), "accessTime", term280455);
        setField(term280427, term280427.getClass(), "card", term280429);
        setField(term280427, term280427.getClass(), "userName", "kBHetuXVIX");
        setIntField(term280427, term280427.getClass(), "isNetMember", 16109140);
        setIntField(term280427, term280427.getClass(), "iconId", -822251246);
        setIntField(term280427, term280427.getClass(), "plateId", -408175867);
        setIntField(term280427, term280427.getClass(), "titleId", 1218877971);
        setIntField(term280427, term280427.getClass(), "partnerId", 1248698741);
        setIntField(term280427, term280427.getClass(), "frameId", 563911514);
        setIntField(term280427, term280427.getClass(), "selectMapId", 1278145075);
        setIntField(term280427, term280427.getClass(), "totalAwake", 347582830);
        setIntField(term280427, term280427.getClass(), "gradeRating", -462578945);
        setIntField(term280427, term280427.getClass(), "musicRating", -1978832006);
        setIntField(term280427, term280427.getClass(), "playerRating", -907787831);
        setIntField(term280427, term280427.getClass(), "highestRating", 1652169311);
        setIntField(term280427, term280427.getClass(), "gradeRank", -6383553);
        setIntField(term280427, term280427.getClass(), "classRank", -107860370);
        setIntField(term280427, term280427.getClass(), "courseRank", -2028015650);
        setField(term280427, term280427.getClass(), "charaSlot", term280492);
        setField(term280427, term280427.getClass(), "charaLockSlot", term280514);
        setLongField(term280427, term280427.getClass(), "contentBit", -3495839072378485289L);
        setIntField(term280427, term280427.getClass(), "playCount", 937869088);
        setField(term280427, term280427.getClass(), "eventWatchedDate", "wjgkxGVWLp");
        setField(term280427, term280427.getClass(), "lastGameId", "CGBDZPutSb");
        setField(term280427, term280427.getClass(), "lastRomVersion", "zlUSnfUdoF");
        setField(term280427, term280427.getClass(), "lastDataVersion", "HdpjMQhjhR");
        setField(term280427, term280427.getClass(), "lastLoginDate", "YGkFfIaeGd");
        setField(term280427, term280427.getClass(), "lastPlayDate", "yLXjLruNNP");
        setIntField(term280427, term280427.getClass(), "lastPlayCredit", 1274857950);
        setIntField(term280427, term280427.getClass(), "lastPlayMode", -1368741236);
        setIntField(term280427, term280427.getClass(), "lastPlaceId", -1881603208);
        setField(term280427, term280427.getClass(), "lastPlaceName", "VPHDBNPBGm");
        setIntField(term280427, term280427.getClass(), "lastAllNetId", 209901165);
        setIntField(term280427, term280427.getClass(), "lastRegionId", 1483392595);
        setField(term280427, term280427.getClass(), "lastRegionName", "lBIJygADhM");
        setField(term280427, term280427.getClass(), "lastClientId", "rpMOuRGfGr");
        setField(term280427, term280427.getClass(), "lastCountryCode", "QdOdiCkUpj");
        setIntField(term280427, term280427.getClass(), "lastSelectEMoney", -1560857878);
        setIntField(term280427, term280427.getClass(), "lastSelectTicket", 1128160797);
        setIntField(term280427, term280427.getClass(), "lastSelectCourse", 1392820107);
        setIntField(term280427, term280427.getClass(), "lastCountCourse", -1757491303);
        setField(term280427, term280427.getClass(), "firstGameId", "gcbuFHLquR");
        setField(term280427, term280427.getClass(), "firstRomVersion", "qYxAvMgHse");
        setField(term280427, term280427.getClass(), "firstDataVersion", "QOxTTxLEBd");
        setField(term280427, term280427.getClass(), "firstPlayDate", "JNrjfsJkdd");
        setField(term280427, term280427.getClass(), "compatibleCmVersion", "XruLHHzcFI");
        setField(term280427, term280427.getClass(), "dailyBonusDate", "ehfFMFARbX");
        setField(term280427, term280427.getClass(), "dailyCourseBonusDate", "lvVJcUbQhH");
        setField(term280427, term280427.getClass(), "lastPairLoginDate", "aGSTcHytvT");
        setField(term280427, term280427.getClass(), "lastTrialPlayDate", "eajfQtluiX");
        setIntField(term280427, term280427.getClass(), "playVsCount", -999355140);
        setIntField(term280427, term280427.getClass(), "playSyncCount", 1775721129);
        setIntField(term280427, term280427.getClass(), "winCount", 2006719115);
        setIntField(term280427, term280427.getClass(), "helpCount", -1083031518);
        setIntField(term280427, term280427.getClass(), "comboCount", -119206782);
        setLongField(term280427, term280427.getClass(), "totalDeluxscore", -3095164236877812304L);
        setLongField(term280427, term280427.getClass(), "totalBasicDeluxscore", 6448637861320508618L);
        setLongField(term280427, term280427.getClass(), "totalAdvancedDeluxscore", -1112424458049429448L);
        setLongField(term280427, term280427.getClass(), "totalExpertDeluxscore", 4357818337507986191L);
        setLongField(term280427, term280427.getClass(), "totalMasterDeluxscore", -4532237169840283596L);
        setLongField(term280427, term280427.getClass(), "totalReMasterDeluxscore", 6437137488576265803L);
        setIntField(term280427, term280427.getClass(), "totalSync", 1472071010);
        setIntField(term280427, term280427.getClass(), "totalBasicSync", 1265410255);
        setIntField(term280427, term280427.getClass(), "totalAdvancedSync", 2511626);
        setIntField(term280427, term280427.getClass(), "totalExpertSync", 44009888);
        setIntField(term280427, term280427.getClass(), "totalMasterSync", -513392311);
        setIntField(term280427, term280427.getClass(), "totalReMasterSync", 1354727885);
        setLongField(term280427, term280427.getClass(), "totalAchievement", 2301872414120726653L);
        setLongField(term280427, term280427.getClass(), "totalBasicAchievement", 3204297901552405232L);
        setLongField(term280427, term280427.getClass(), "totalAdvancedAchievement", 8964809273821124653L);
        setLongField(term280427, term280427.getClass(), "totalExpertAchievement", 8595701974537837759L);
        setLongField(term280427, term280427.getClass(), "totalMasterAchievement", 6529856194319907021L);
        setLongField(term280427, term280427.getClass(), "totalReMasterAchievement", 6692814842862214029L);
        setLongField(term280427, term280427.getClass(), "playerOldRating", -968126468745239886L);
        setLongField(term280427, term280427.getClass(), "playerNewRating", -3171885568946917303L);
        setIntField(term280427, term280427.getClass(), "banState", 1202764688);
        setLongField(term280427, term280427.getClass(), "dateTime", 3156826472011017123L);
        term280800 = new Long(6907262303973250620L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term280800;
        callMethod(klass, "setTotalReMasterAchievement", argTypes, term280427, args);
    }

};


