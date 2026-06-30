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
import java.lang.Integer;

public class UserData_setFirstTutorialCancelNum_523765487323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286473;
     Object term286550;

    public UserData_setFirstTutorialCancelNum_523765487323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286473 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286473, term286473.getClass(), "id", 0L);
        setField(term286473, term286473.getClass(), "card", null);
        setField(term286473, term286473.getClass(), "userName", null);
        setIntField(term286473, term286473.getClass(), "level", 0);
        setIntField(term286473, term286473.getClass(), "reincarnationNum", 0);
        setField(term286473, term286473.getClass(), "exp", null);
        setLongField(term286473, term286473.getClass(), "point", 0L);
        setLongField(term286473, term286473.getClass(), "totalPoint", 0L);
        setIntField(term286473, term286473.getClass(), "playCount", 0);
        setIntField(term286473, term286473.getClass(), "multiPlayCount", 0);
        setIntField(term286473, term286473.getClass(), "playerRating", 0);
        setIntField(term286473, term286473.getClass(), "highestRating", 0);
        setIntField(term286473, term286473.getClass(), "nameplateId", 0);
        setIntField(term286473, term286473.getClass(), "frameId", 0);
        setIntField(term286473, term286473.getClass(), "characterId", 0);
        setIntField(term286473, term286473.getClass(), "trophyId", 0);
        setIntField(term286473, term286473.getClass(), "playedTutorialBit", 0);
        setIntField(term286473, term286473.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286473, term286473.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286473, term286473.getClass(), "totalMapNum", 0);
        setLongField(term286473, term286473.getClass(), "totalHiScore", 0L);
        setLongField(term286473, term286473.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286473, term286473.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286473, term286473.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286473, term286473.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286473, term286473.getClass(), "totalUltimaHighScore", 0L);
        setField(term286473, term286473.getClass(), "eventWatchedDate", null);
        setIntField(term286473, term286473.getClass(), "friendCount", 0);
        setField(term286473, term286473.getClass(), "firstGameId", null);
        setField(term286473, term286473.getClass(), "firstRomVersion", null);
        setField(term286473, term286473.getClass(), "firstDataVersion", null);
        setField(term286473, term286473.getClass(), "firstPlayDate", null);
        setField(term286473, term286473.getClass(), "lastGameId", null);
        setField(term286473, term286473.getClass(), "lastRomVersion", null);
        setField(term286473, term286473.getClass(), "lastDataVersion", null);
        setField(term286473, term286473.getClass(), "lastLoginDate", null);
        setField(term286473, term286473.getClass(), "lastPlayDate", null);
        setIntField(term286473, term286473.getClass(), "lastPlaceId", 0);
        setField(term286473, term286473.getClass(), "lastPlaceName", null);
        setField(term286473, term286473.getClass(), "lastRegionId", null);
        setField(term286473, term286473.getClass(), "lastRegionName", null);
        setField(term286473, term286473.getClass(), "lastAllNetId", null);
        setField(term286473, term286473.getClass(), "lastClientId", null);
        setField(term286473, term286473.getClass(), "lastCountryCode", null);
        setField(term286473, term286473.getClass(), "userNameEx", null);
        setField(term286473, term286473.getClass(), "compatibleCmVersion", null);
        setIntField(term286473, term286473.getClass(), "medal", 0);
        setIntField(term286473, term286473.getClass(), "mapIconId", 0);
        setIntField(term286473, term286473.getClass(), "voiceId", 0);
        setIntField(term286473, term286473.getClass(), "avatarWear", 0);
        setIntField(term286473, term286473.getClass(), "avatarHead", 0);
        setIntField(term286473, term286473.getClass(), "avatarFace", 0);
        setIntField(term286473, term286473.getClass(), "avatarSkin", 0);
        setIntField(term286473, term286473.getClass(), "avatarItem", 0);
        setIntField(term286473, term286473.getClass(), "avatarFront", 0);
        setIntField(term286473, term286473.getClass(), "avatarBack", 0);
        setIntField(term286473, term286473.getClass(), "classEmblemBase", 0);
        setIntField(term286473, term286473.getClass(), "classEmblemMedal", 0);
        setIntField(term286473, term286473.getClass(), "stockedGridCount", 0);
        setIntField(term286473, term286473.getClass(), "exMapLoopCount", 0);
        setIntField(term286473, term286473.getClass(), "netBattlePlayCount", 0);
        setIntField(term286473, term286473.getClass(), "netBattleWinCount", 0);
        setIntField(term286473, term286473.getClass(), "netBattleLoseCount", 0);
        setIntField(term286473, term286473.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286473, term286473.getClass(), "charaIllustId", 0);
        setIntField(term286473, term286473.getClass(), "skillId", 0);
        setIntField(term286473, term286473.getClass(), "overPowerPoint", 0);
        setIntField(term286473, term286473.getClass(), "overPowerRate", 0);
        setIntField(term286473, term286473.getClass(), "overPowerLowerRank", 0);
        setIntField(term286473, term286473.getClass(), "avatarPoint", 0);
        setIntField(term286473, term286473.getClass(), "battleRankId", 0);
        setIntField(term286473, term286473.getClass(), "battleRankPoint", 0);
        setIntField(term286473, term286473.getClass(), "eliteRankPoint", 0);
        setIntField(term286473, term286473.getClass(), "netBattle1stCount", 0);
        setIntField(term286473, term286473.getClass(), "netBattle2ndCount", 0);
        setIntField(term286473, term286473.getClass(), "netBattle3rdCount", 0);
        setIntField(term286473, term286473.getClass(), "netBattle4thCount", 0);
        setIntField(term286473, term286473.getClass(), "netBattleCorrection", 0);
        setIntField(term286473, term286473.getClass(), "netBattleErrCnt", 0);
        setIntField(term286473, term286473.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286473, term286473.getClass(), "battleRewardStatus", 0);
        setIntField(term286473, term286473.getClass(), "battleRewardIndex", 0);
        setIntField(term286473, term286473.getClass(), "battleRewardCount", 0);
        setIntField(term286473, term286473.getClass(), "ext1", 0);
        setIntField(term286473, term286473.getClass(), "ext2", 0);
        setIntField(term286473, term286473.getClass(), "ext3", 0);
        setIntField(term286473, term286473.getClass(), "ext4", 0);
        setIntField(term286473, term286473.getClass(), "ext5", 0);
        setIntField(term286473, term286473.getClass(), "ext6", 0);
        setIntField(term286473, term286473.getClass(), "ext7", 0);
        setIntField(term286473, term286473.getClass(), "ext8", 0);
        setIntField(term286473, term286473.getClass(), "ext9", 0);
        setIntField(term286473, term286473.getClass(), "ext10", 0);
        setField(term286473, term286473.getClass(), "extStr1", null);
        setField(term286473, term286473.getClass(), "extStr2", null);
        setLongField(term286473, term286473.getClass(), "extLong1", 0L);
        setLongField(term286473, term286473.getClass(), "extLong2", 0L);
        setField(term286473, term286473.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286473, term286473.getClass(), "isNetBattleHost", false);
        setIntField(term286473, term286473.getClass(), "netBattleEndState", 0);
        term286550 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286550;
        callMethod(klass, "setFirstTutorialCancelNum", argTypes, term286473, args);
    }

};


