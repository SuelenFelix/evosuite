package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserData_setTotalExpertHighScore_507046227329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286947;
     Object term287024;

    public UserData_setTotalExpertHighScore_507046227329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286947 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286947, term286947.getClass(), "id", 0L);
        setField(term286947, term286947.getClass(), "card", null);
        setField(term286947, term286947.getClass(), "userName", null);
        setIntField(term286947, term286947.getClass(), "level", 0);
        setIntField(term286947, term286947.getClass(), "reincarnationNum", 0);
        setField(term286947, term286947.getClass(), "exp", null);
        setLongField(term286947, term286947.getClass(), "point", 0L);
        setLongField(term286947, term286947.getClass(), "totalPoint", 0L);
        setIntField(term286947, term286947.getClass(), "playCount", 0);
        setIntField(term286947, term286947.getClass(), "multiPlayCount", 0);
        setIntField(term286947, term286947.getClass(), "playerRating", 0);
        setIntField(term286947, term286947.getClass(), "highestRating", 0);
        setIntField(term286947, term286947.getClass(), "nameplateId", 0);
        setIntField(term286947, term286947.getClass(), "frameId", 0);
        setIntField(term286947, term286947.getClass(), "characterId", 0);
        setIntField(term286947, term286947.getClass(), "trophyId", 0);
        setIntField(term286947, term286947.getClass(), "playedTutorialBit", 0);
        setIntField(term286947, term286947.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286947, term286947.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286947, term286947.getClass(), "totalMapNum", 0);
        setLongField(term286947, term286947.getClass(), "totalHiScore", 0L);
        setLongField(term286947, term286947.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286947, term286947.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286947, term286947.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286947, term286947.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286947, term286947.getClass(), "totalUltimaHighScore", 0L);
        setField(term286947, term286947.getClass(), "eventWatchedDate", null);
        setIntField(term286947, term286947.getClass(), "friendCount", 0);
        setField(term286947, term286947.getClass(), "firstGameId", null);
        setField(term286947, term286947.getClass(), "firstRomVersion", null);
        setField(term286947, term286947.getClass(), "firstDataVersion", null);
        setField(term286947, term286947.getClass(), "firstPlayDate", null);
        setField(term286947, term286947.getClass(), "lastGameId", null);
        setField(term286947, term286947.getClass(), "lastRomVersion", null);
        setField(term286947, term286947.getClass(), "lastDataVersion", null);
        setField(term286947, term286947.getClass(), "lastLoginDate", null);
        setField(term286947, term286947.getClass(), "lastPlayDate", null);
        setIntField(term286947, term286947.getClass(), "lastPlaceId", 0);
        setField(term286947, term286947.getClass(), "lastPlaceName", null);
        setField(term286947, term286947.getClass(), "lastRegionId", null);
        setField(term286947, term286947.getClass(), "lastRegionName", null);
        setField(term286947, term286947.getClass(), "lastAllNetId", null);
        setField(term286947, term286947.getClass(), "lastClientId", null);
        setField(term286947, term286947.getClass(), "lastCountryCode", null);
        setField(term286947, term286947.getClass(), "userNameEx", null);
        setField(term286947, term286947.getClass(), "compatibleCmVersion", null);
        setIntField(term286947, term286947.getClass(), "medal", 0);
        setIntField(term286947, term286947.getClass(), "mapIconId", 0);
        setIntField(term286947, term286947.getClass(), "voiceId", 0);
        setIntField(term286947, term286947.getClass(), "avatarWear", 0);
        setIntField(term286947, term286947.getClass(), "avatarHead", 0);
        setIntField(term286947, term286947.getClass(), "avatarFace", 0);
        setIntField(term286947, term286947.getClass(), "avatarSkin", 0);
        setIntField(term286947, term286947.getClass(), "avatarItem", 0);
        setIntField(term286947, term286947.getClass(), "avatarFront", 0);
        setIntField(term286947, term286947.getClass(), "avatarBack", 0);
        setIntField(term286947, term286947.getClass(), "classEmblemBase", 0);
        setIntField(term286947, term286947.getClass(), "classEmblemMedal", 0);
        setIntField(term286947, term286947.getClass(), "stockedGridCount", 0);
        setIntField(term286947, term286947.getClass(), "exMapLoopCount", 0);
        setIntField(term286947, term286947.getClass(), "netBattlePlayCount", 0);
        setIntField(term286947, term286947.getClass(), "netBattleWinCount", 0);
        setIntField(term286947, term286947.getClass(), "netBattleLoseCount", 0);
        setIntField(term286947, term286947.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286947, term286947.getClass(), "charaIllustId", 0);
        setIntField(term286947, term286947.getClass(), "skillId", 0);
        setIntField(term286947, term286947.getClass(), "overPowerPoint", 0);
        setIntField(term286947, term286947.getClass(), "overPowerRate", 0);
        setIntField(term286947, term286947.getClass(), "overPowerLowerRank", 0);
        setIntField(term286947, term286947.getClass(), "avatarPoint", 0);
        setIntField(term286947, term286947.getClass(), "battleRankId", 0);
        setIntField(term286947, term286947.getClass(), "battleRankPoint", 0);
        setIntField(term286947, term286947.getClass(), "eliteRankPoint", 0);
        setIntField(term286947, term286947.getClass(), "netBattle1stCount", 0);
        setIntField(term286947, term286947.getClass(), "netBattle2ndCount", 0);
        setIntField(term286947, term286947.getClass(), "netBattle3rdCount", 0);
        setIntField(term286947, term286947.getClass(), "netBattle4thCount", 0);
        setIntField(term286947, term286947.getClass(), "netBattleCorrection", 0);
        setIntField(term286947, term286947.getClass(), "netBattleErrCnt", 0);
        setIntField(term286947, term286947.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286947, term286947.getClass(), "battleRewardStatus", 0);
        setIntField(term286947, term286947.getClass(), "battleRewardIndex", 0);
        setIntField(term286947, term286947.getClass(), "battleRewardCount", 0);
        setIntField(term286947, term286947.getClass(), "ext1", 0);
        setIntField(term286947, term286947.getClass(), "ext2", 0);
        setIntField(term286947, term286947.getClass(), "ext3", 0);
        setIntField(term286947, term286947.getClass(), "ext4", 0);
        setIntField(term286947, term286947.getClass(), "ext5", 0);
        setIntField(term286947, term286947.getClass(), "ext6", 0);
        setIntField(term286947, term286947.getClass(), "ext7", 0);
        setIntField(term286947, term286947.getClass(), "ext8", 0);
        setIntField(term286947, term286947.getClass(), "ext9", 0);
        setIntField(term286947, term286947.getClass(), "ext10", 0);
        setField(term286947, term286947.getClass(), "extStr1", null);
        setField(term286947, term286947.getClass(), "extStr2", null);
        setLongField(term286947, term286947.getClass(), "extLong1", 0L);
        setLongField(term286947, term286947.getClass(), "extLong2", 0L);
        setField(term286947, term286947.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286947, term286947.getClass(), "isNetBattleHost", false);
        setIntField(term286947, term286947.getClass(), "netBattleEndState", 0);
        term287024 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term287024;
        callMethod(klass, "setTotalExpertHighScore", argTypes, term286947, args);
    }

};


