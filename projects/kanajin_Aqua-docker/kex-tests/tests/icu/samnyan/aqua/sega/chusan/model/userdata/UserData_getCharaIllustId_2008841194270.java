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

public class UserData_getCharaIllustId_2008841194270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282364;

    public UserData_getCharaIllustId_2008841194270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282364 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term282364, term282364.getClass(), "id", 0L);
        setField(term282364, term282364.getClass(), "card", null);
        setField(term282364, term282364.getClass(), "userName", null);
        setIntField(term282364, term282364.getClass(), "level", 0);
        setIntField(term282364, term282364.getClass(), "reincarnationNum", 0);
        setField(term282364, term282364.getClass(), "exp", null);
        setLongField(term282364, term282364.getClass(), "point", 0L);
        setLongField(term282364, term282364.getClass(), "totalPoint", 0L);
        setIntField(term282364, term282364.getClass(), "playCount", 0);
        setIntField(term282364, term282364.getClass(), "multiPlayCount", 0);
        setIntField(term282364, term282364.getClass(), "playerRating", 0);
        setIntField(term282364, term282364.getClass(), "highestRating", 0);
        setIntField(term282364, term282364.getClass(), "nameplateId", 0);
        setIntField(term282364, term282364.getClass(), "frameId", 0);
        setIntField(term282364, term282364.getClass(), "characterId", 0);
        setIntField(term282364, term282364.getClass(), "trophyId", 0);
        setIntField(term282364, term282364.getClass(), "playedTutorialBit", 0);
        setIntField(term282364, term282364.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term282364, term282364.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term282364, term282364.getClass(), "totalMapNum", 0);
        setLongField(term282364, term282364.getClass(), "totalHiScore", 0L);
        setLongField(term282364, term282364.getClass(), "totalBasicHighScore", 0L);
        setLongField(term282364, term282364.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term282364, term282364.getClass(), "totalExpertHighScore", 0L);
        setLongField(term282364, term282364.getClass(), "totalMasterHighScore", 0L);
        setLongField(term282364, term282364.getClass(), "totalUltimaHighScore", 0L);
        setField(term282364, term282364.getClass(), "eventWatchedDate", null);
        setIntField(term282364, term282364.getClass(), "friendCount", 0);
        setField(term282364, term282364.getClass(), "firstGameId", null);
        setField(term282364, term282364.getClass(), "firstRomVersion", null);
        setField(term282364, term282364.getClass(), "firstDataVersion", null);
        setField(term282364, term282364.getClass(), "firstPlayDate", null);
        setField(term282364, term282364.getClass(), "lastGameId", null);
        setField(term282364, term282364.getClass(), "lastRomVersion", null);
        setField(term282364, term282364.getClass(), "lastDataVersion", null);
        setField(term282364, term282364.getClass(), "lastLoginDate", null);
        setField(term282364, term282364.getClass(), "lastPlayDate", null);
        setIntField(term282364, term282364.getClass(), "lastPlaceId", 0);
        setField(term282364, term282364.getClass(), "lastPlaceName", null);
        setField(term282364, term282364.getClass(), "lastRegionId", null);
        setField(term282364, term282364.getClass(), "lastRegionName", null);
        setField(term282364, term282364.getClass(), "lastAllNetId", null);
        setField(term282364, term282364.getClass(), "lastClientId", null);
        setField(term282364, term282364.getClass(), "lastCountryCode", null);
        setField(term282364, term282364.getClass(), "userNameEx", null);
        setField(term282364, term282364.getClass(), "compatibleCmVersion", null);
        setIntField(term282364, term282364.getClass(), "medal", 0);
        setIntField(term282364, term282364.getClass(), "mapIconId", 0);
        setIntField(term282364, term282364.getClass(), "voiceId", 0);
        setIntField(term282364, term282364.getClass(), "avatarWear", 0);
        setIntField(term282364, term282364.getClass(), "avatarHead", 0);
        setIntField(term282364, term282364.getClass(), "avatarFace", 0);
        setIntField(term282364, term282364.getClass(), "avatarSkin", 0);
        setIntField(term282364, term282364.getClass(), "avatarItem", 0);
        setIntField(term282364, term282364.getClass(), "avatarFront", 0);
        setIntField(term282364, term282364.getClass(), "avatarBack", 0);
        setIntField(term282364, term282364.getClass(), "classEmblemBase", 0);
        setIntField(term282364, term282364.getClass(), "classEmblemMedal", 0);
        setIntField(term282364, term282364.getClass(), "stockedGridCount", 0);
        setIntField(term282364, term282364.getClass(), "exMapLoopCount", 0);
        setIntField(term282364, term282364.getClass(), "netBattlePlayCount", 0);
        setIntField(term282364, term282364.getClass(), "netBattleWinCount", 0);
        setIntField(term282364, term282364.getClass(), "netBattleLoseCount", 0);
        setIntField(term282364, term282364.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term282364, term282364.getClass(), "charaIllustId", 0);
        setIntField(term282364, term282364.getClass(), "skillId", 0);
        setIntField(term282364, term282364.getClass(), "overPowerPoint", 0);
        setIntField(term282364, term282364.getClass(), "overPowerRate", 0);
        setIntField(term282364, term282364.getClass(), "overPowerLowerRank", 0);
        setIntField(term282364, term282364.getClass(), "avatarPoint", 0);
        setIntField(term282364, term282364.getClass(), "battleRankId", 0);
        setIntField(term282364, term282364.getClass(), "battleRankPoint", 0);
        setIntField(term282364, term282364.getClass(), "eliteRankPoint", 0);
        setIntField(term282364, term282364.getClass(), "netBattle1stCount", 0);
        setIntField(term282364, term282364.getClass(), "netBattle2ndCount", 0);
        setIntField(term282364, term282364.getClass(), "netBattle3rdCount", 0);
        setIntField(term282364, term282364.getClass(), "netBattle4thCount", 0);
        setIntField(term282364, term282364.getClass(), "netBattleCorrection", 0);
        setIntField(term282364, term282364.getClass(), "netBattleErrCnt", 0);
        setIntField(term282364, term282364.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term282364, term282364.getClass(), "battleRewardStatus", 0);
        setIntField(term282364, term282364.getClass(), "battleRewardIndex", 0);
        setIntField(term282364, term282364.getClass(), "battleRewardCount", 0);
        setIntField(term282364, term282364.getClass(), "ext1", 0);
        setIntField(term282364, term282364.getClass(), "ext2", 0);
        setIntField(term282364, term282364.getClass(), "ext3", 0);
        setIntField(term282364, term282364.getClass(), "ext4", 0);
        setIntField(term282364, term282364.getClass(), "ext5", 0);
        setIntField(term282364, term282364.getClass(), "ext6", 0);
        setIntField(term282364, term282364.getClass(), "ext7", 0);
        setIntField(term282364, term282364.getClass(), "ext8", 0);
        setIntField(term282364, term282364.getClass(), "ext9", 0);
        setIntField(term282364, term282364.getClass(), "ext10", 0);
        setField(term282364, term282364.getClass(), "extStr1", null);
        setField(term282364, term282364.getClass(), "extStr2", null);
        setLongField(term282364, term282364.getClass(), "extLong1", 0L);
        setLongField(term282364, term282364.getClass(), "extLong2", 0L);
        setField(term282364, term282364.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term282364, term282364.getClass(), "isNetBattleHost", false);
        setIntField(term282364, term282364.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaIllustId", argTypes, term282364, args);
    }

};


