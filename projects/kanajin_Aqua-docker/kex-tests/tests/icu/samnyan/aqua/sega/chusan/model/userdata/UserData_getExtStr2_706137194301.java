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

public class UserData_getExtStr2_706137194301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219275;

    public UserData_getExtStr2_706137194301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4219275 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4219275, term4219275.getClass(), "id", 0L);
        setField(term4219275, term4219275.getClass(), "card", null);
        setField(term4219275, term4219275.getClass(), "userName", null);
        setIntField(term4219275, term4219275.getClass(), "level", 0);
        setIntField(term4219275, term4219275.getClass(), "reincarnationNum", 0);
        setField(term4219275, term4219275.getClass(), "exp", null);
        setLongField(term4219275, term4219275.getClass(), "point", 0L);
        setLongField(term4219275, term4219275.getClass(), "totalPoint", 0L);
        setIntField(term4219275, term4219275.getClass(), "playCount", 0);
        setIntField(term4219275, term4219275.getClass(), "multiPlayCount", 0);
        setIntField(term4219275, term4219275.getClass(), "playerRating", 0);
        setIntField(term4219275, term4219275.getClass(), "highestRating", 0);
        setIntField(term4219275, term4219275.getClass(), "nameplateId", 0);
        setIntField(term4219275, term4219275.getClass(), "frameId", 0);
        setIntField(term4219275, term4219275.getClass(), "characterId", 0);
        setIntField(term4219275, term4219275.getClass(), "trophyId", 0);
        setIntField(term4219275, term4219275.getClass(), "playedTutorialBit", 0);
        setIntField(term4219275, term4219275.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4219275, term4219275.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4219275, term4219275.getClass(), "totalMapNum", 0);
        setLongField(term4219275, term4219275.getClass(), "totalHiScore", 0L);
        setLongField(term4219275, term4219275.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4219275, term4219275.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4219275, term4219275.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4219275, term4219275.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4219275, term4219275.getClass(), "totalUltimaHighScore", 0L);
        setField(term4219275, term4219275.getClass(), "eventWatchedDate", null);
        setIntField(term4219275, term4219275.getClass(), "friendCount", 0);
        setField(term4219275, term4219275.getClass(), "firstGameId", null);
        setField(term4219275, term4219275.getClass(), "firstRomVersion", null);
        setField(term4219275, term4219275.getClass(), "firstDataVersion", null);
        setField(term4219275, term4219275.getClass(), "firstPlayDate", null);
        setField(term4219275, term4219275.getClass(), "lastGameId", null);
        setField(term4219275, term4219275.getClass(), "lastRomVersion", null);
        setField(term4219275, term4219275.getClass(), "lastDataVersion", null);
        setField(term4219275, term4219275.getClass(), "lastLoginDate", null);
        setField(term4219275, term4219275.getClass(), "lastPlayDate", null);
        setIntField(term4219275, term4219275.getClass(), "lastPlaceId", 0);
        setField(term4219275, term4219275.getClass(), "lastPlaceName", null);
        setField(term4219275, term4219275.getClass(), "lastRegionId", null);
        setField(term4219275, term4219275.getClass(), "lastRegionName", null);
        setField(term4219275, term4219275.getClass(), "lastAllNetId", null);
        setField(term4219275, term4219275.getClass(), "lastClientId", null);
        setField(term4219275, term4219275.getClass(), "lastCountryCode", null);
        setField(term4219275, term4219275.getClass(), "userNameEx", null);
        setField(term4219275, term4219275.getClass(), "compatibleCmVersion", null);
        setIntField(term4219275, term4219275.getClass(), "medal", 0);
        setIntField(term4219275, term4219275.getClass(), "mapIconId", 0);
        setIntField(term4219275, term4219275.getClass(), "voiceId", 0);
        setIntField(term4219275, term4219275.getClass(), "avatarWear", 0);
        setIntField(term4219275, term4219275.getClass(), "avatarHead", 0);
        setIntField(term4219275, term4219275.getClass(), "avatarFace", 0);
        setIntField(term4219275, term4219275.getClass(), "avatarSkin", 0);
        setIntField(term4219275, term4219275.getClass(), "avatarItem", 0);
        setIntField(term4219275, term4219275.getClass(), "avatarFront", 0);
        setIntField(term4219275, term4219275.getClass(), "avatarBack", 0);
        setIntField(term4219275, term4219275.getClass(), "classEmblemBase", 0);
        setIntField(term4219275, term4219275.getClass(), "classEmblemMedal", 0);
        setIntField(term4219275, term4219275.getClass(), "stockedGridCount", 0);
        setIntField(term4219275, term4219275.getClass(), "exMapLoopCount", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattlePlayCount", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattleWinCount", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattleLoseCount", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4219275, term4219275.getClass(), "charaIllustId", 0);
        setIntField(term4219275, term4219275.getClass(), "skillId", 0);
        setIntField(term4219275, term4219275.getClass(), "overPowerPoint", 0);
        setIntField(term4219275, term4219275.getClass(), "overPowerRate", 0);
        setIntField(term4219275, term4219275.getClass(), "overPowerLowerRank", 0);
        setIntField(term4219275, term4219275.getClass(), "avatarPoint", 0);
        setIntField(term4219275, term4219275.getClass(), "battleRankId", 0);
        setIntField(term4219275, term4219275.getClass(), "battleRankPoint", 0);
        setIntField(term4219275, term4219275.getClass(), "eliteRankPoint", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattle1stCount", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattle2ndCount", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattle3rdCount", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattle4thCount", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattleCorrection", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattleErrCnt", 0);
        setIntField(term4219275, term4219275.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4219275, term4219275.getClass(), "battleRewardStatus", 0);
        setIntField(term4219275, term4219275.getClass(), "battleRewardIndex", 0);
        setIntField(term4219275, term4219275.getClass(), "battleRewardCount", 0);
        setIntField(term4219275, term4219275.getClass(), "ext1", 0);
        setIntField(term4219275, term4219275.getClass(), "ext2", 0);
        setIntField(term4219275, term4219275.getClass(), "ext3", 0);
        setIntField(term4219275, term4219275.getClass(), "ext4", 0);
        setIntField(term4219275, term4219275.getClass(), "ext5", 0);
        setIntField(term4219275, term4219275.getClass(), "ext6", 0);
        setIntField(term4219275, term4219275.getClass(), "ext7", 0);
        setIntField(term4219275, term4219275.getClass(), "ext8", 0);
        setIntField(term4219275, term4219275.getClass(), "ext9", 0);
        setIntField(term4219275, term4219275.getClass(), "ext10", 0);
        setField(term4219275, term4219275.getClass(), "extStr1", null);
        setField(term4219275, term4219275.getClass(), "extStr2", null);
        setLongField(term4219275, term4219275.getClass(), "extLong1", 0L);
        setLongField(term4219275, term4219275.getClass(), "extLong2", 0L);
        setField(term4219275, term4219275.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4219275, term4219275.getClass(), "isNetBattleHost", false);
        setIntField(term4219275, term4219275.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtStr2", argTypes, term4219275, args);
    }

};


