// JavaScript Array Methods
const episodes = [
  { Title: 'Smithereens', Season: 5 },
  { Title: 'Rachel, Jack and Ashley Too', Season: 5 },
  { Title: 'Hang the DJ', Season: 4 },
  { Title: 'Arkangel', Season: 4 },
  { Title: 'Nosedive', Season: 3 },
  { Title: 'Men Against Fire', Season: 3 },
  { Title: 'White Bear', Season: 2 },
  { Title: 'The Entire History Of You', Season: 1 }
]

const filteredEpisodes = episodes.filter((episode) => {
  return episode.Season <= 3
}); // filters objects

const episodeTitles = episodes.map((episode) => {
  return episode.Title
}); // stores key values

const bestEpisode = episodes.find((episode) => {
  return episode.Title === 'Hang the DJ'
}); // finds specific values

episodes.forEach((episode) => {
	console.log(episode.Title)
}) // for each value.. do the following

const hasOverThreeSeasons = episodes.some((episode) => {
	return episode.Season > 3
}) // checks if statement returns true

console.log(filteredEpisodes)
console.log(episodeTitles)
console.log(bestEpisode)
console.log(hasOverThreeSeasons)
