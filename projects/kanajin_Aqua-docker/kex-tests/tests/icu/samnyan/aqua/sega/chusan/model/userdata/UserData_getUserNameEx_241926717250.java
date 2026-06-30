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

public class UserData_getUserNameEx_241926717250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280824;

    public UserData_getUserNameEx_241926717250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280824 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term280824, term280824.getClass(), "id", 0L);
        setField(term280824, term280824.getClass(), "card", null);
        setField(term280824, term280824.getClass(), "userName", null);
        setIntField(term280824, term280824.getClass(), "level", 0);
        setIntField(term280824, term280824.getClass(), "reincarnationNum", 0);
        setField(term280824, term280824.getClass(), "exp", null);
        setLongField(term280824, term280824.getClass(), "point", 0L);
        setLongField(term280824, term280824.getClass(), "totalPoint", 0L);
        setIntField(term280824, term280824.getClass(), "playCount", 0);
        setIntField(term280824, term280824.getClass(), "multiPlayCount", 0);
        setIntField(term280824, term280824.getClass(), "playerRating", 0);
        setIntField(term280824, term280824.getClass(), "highestRating", 0);
        setIntField(term280824, term280824.getClass(), "nameplateId", 0);
        setIntField(term280824, term280824.getClass(), "frameId", 0);
        setIntField(term280824, term280824.getClass(), "characterId", 0);
        setIntField(term280824, term280824.getClass(), "trophyId", 0);
        setIntField(term280824, term280824.getClass(), "playedTutorialBit", 0);
        setIntField(term280824, term280824.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term280824, term280824.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term280824, term280824.getClass(), "totalMapNum", 0);
        setLongField(term280824, term280824.getClass(), "totalHiScore", 0L);
        setLongField(term280824, term280824.getClass(), "totalBasicHighScore", 0L);
        setLongField(term280824, term280824.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term280824, term280824.getClass(), "totalExpertHighScore", 0L);
        setLongField(term280824, term280824.getClass(), "totalMasterHighScore", 0L);
        setLongField(term280824, term280824.getClass(), "totalUltimaHighScore", 0L);
        setField(term280824, term280824.getClass(), "eventWatchedDate", null);
        setIntField(term280824, term280824.getClass(), "friendCount", 0);
        setField(term280824, term280824.getClass(), "firstGameId", null);
        setField(term280824, term280824.getClass(), "firstRomVersion", null);
        setField(term280824, term280824.getClass(), "firstDataVersion", null);
        setField(term280824, term280824.getClass(), "firstPlayDate", null);
        setField(term280824, term280824.getClass(), "lastGameId", null);
        setField(term280824, term280824.getClass(), "lastRomVersion", null);
        setField(term280824, term280824.getClass(), "lastDataVersion", null);
        setField(term280824, term280824.getClass(), "lastLoginDate", null);
        setField(term280824, term280824.getClass(), "lastPlayDate", null);
        setIntField(term280824, term280824.getClass(), "lastPlaceId", 0);
        setField(term280824, term280824.getClass(), "lastPlaceName", null);
        setField(term280824, term280824.getClass(), "lastRegionId", null);
        setField(term280824, term280824.getClass(), "lastRegionName", null);
        setField(term280824, term280824.getClass(), "lastAllNetId", null);
        setField(term280824, term280824.getClass(), "lastClientId", null);
        setField(term280824, term280824.getClass(), "lastCountryCode", null);
        setField(term280824, term280824.getClass(), "userNameEx", null);
        setField(term280824, term280824.getClass(), "compatibleCmVersion", null);
        setIntField(term280824, term280824.getClass(), "medal", 0);
        setIntField(term280824, term280824.getClass(), "mapIconId", 0);
        setIntField(term280824, term280824.getClass(), "voiceId", 0);
        setIntField(term280824, term280824.getClass(), "avatarWear", 0);
        setIntField(term280824, term280824.getClass(), "avatarHead", 0);
        setIntField(term280824, term280824.getClass(), "avatarFace", 0);
        setIntField(term280824, term280824.getClass(), "avatarSkin", 0);
        setIntField(term280824, term280824.getClass(), "avatarItem", 0);
        setIntField(term280824, term280824.getClass(), "avatarFront", 0);
        setIntField(term280824, term280824.getClass(), "avatarBack", 0);
        setIntField(term280824, term280824.getClass(), "classEmblemBase", 0);
        setIntField(term280824, term280824.getClass(), "classEmblemMedal", 0);
        setIntField(term280824, term280824.getClass(), "stockedGridCount", 0);
        setIntField(term280824, term280824.getClass(), "exMapLoopCount", 0);
        setIntField(term280824, term280824.getClass(), "netBattlePlayCount", 0);
        setIntField(term280824, term280824.getClass(), "netBattleWinCount", 0);
        setIntField(term280824, term280824.getClass(), "netBattleLoseCount", 0);
        setIntField(term280824, term280824.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term280824, term280824.getClass(), "charaIllustId", 0);
        setIntField(term280824, term280824.getClass(), "skillId", 0);
        setIntField(term280824, term280824.getClass(), "overPowerPoint", 0);
        setIntField(term280824, term280824.getClass(), "overPowerRate", 0);
        setIntField(term280824, term280824.getClass(), "overPowerLowerRank", 0);
        setIntField(term280824, term280824.getClass(), "avatarPoint", 0);
        setIntField(term280824, term280824.getClass(), "battleRankId", 0);
        setIntField(term280824, term280824.getClass(), "battleRankPoint", 0);
        setIntField(term280824, term280824.getClass(), "eliteRankPoint", 0);
        setIntField(term280824, term280824.getClass(), "netBattle1stCount", 0);
        setIntField(term280824, term280824.getClass(), "netBattle2ndCount", 0);
        setIntField(term280824, term280824.getClass(), "netBattle3rdCount", 0);
        setIntField(term280824, term280824.getClass(), "netBattle4thCount", 0);
        setIntField(term280824, term280824.getClass(), "netBattleCorrection", 0);
        setIntField(term280824, term280824.getClass(), "netBattleErrCnt", 0);
        setIntField(term280824, term280824.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term280824, term280824.getClass(), "battleRewardStatus", 0);
        setIntField(term280824, term280824.getClass(), "battleRewardIndex", 0);
        setIntField(term280824, term280824.getClass(), "battleRewardCount", 0);
        setIntField(term280824, term280824.getClass(), "ext1", 0);
        setIntField(term280824, term280824.getClass(), "ext2", 0);
        setIntField(term280824, term280824.getClass(), "ext3", 0);
        setIntField(term280824, term280824.getClass(), "ext4", 0);
        setIntField(term280824, term280824.getClass(), "ext5", 0);
        setIntField(term280824, term280824.getClass(), "ext6", 0);
        setIntField(term280824, term280824.getClass(), "ext7", 0);
        setIntField(term280824, term280824.getClass(), "ext8", 0);
        setIntField(term280824, term280824.getClass(), "ext9", 0);
        setIntField(term280824, term280824.getClass(), "ext10", 0);
        setField(term280824, term280824.getClass(), "extStr1", null);
        setField(term280824, term280824.getClass(), "extStr2", null);
        setLongField(term280824, term280824.getClass(), "extLong1", 0L);
        setLongField(term280824, term280824.getClass(), "extLong2", 0L);
        setField(term280824, term280824.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term280824, term280824.getClass(), "isNetBattleHost", false);
        setIntField(term280824, term280824.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserNameEx", argTypes, term280824, args);
    }

};


